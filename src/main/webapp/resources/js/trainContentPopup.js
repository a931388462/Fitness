;
//初始化条数
var initNum = 5;
//取得要添加节点的代码
var $addDom = $("#dom").html();

$(function(){
	//item初始化
	for(var i=1;i<=initNum;i++){
		addItemNumber($addDom);
	}
	changeItemNumber();
	bindLastInputEvent();	
});

/* 取得最后一组item */
function getLastInput() {
	return $("[id^='item']").last().find("input");
}

///追加item节点
function addItemNumber(dom){
	$("#father").append(dom);
}

//item变更id
function changeItemNumber(){
	$("[id^='item']").each(function(i,element) {
		element.id = "item" + i;
	});
}

/*添加新item并将事件绑定到最后一组input*/
function bindLastInputEvent(){
	var lastinputs = getLastInput();
	lastinputs.off("blur");//绑定前先清除可能存在的事件，避免重复绑定。
	lastinputs.on("blur",function(){
		var flag = true;
		lastinputs.each(function(){
			if(this.value == ""||this.value==null){
				flag = false;
			}
		});
		//最后的item不为空，解绑事件，追加新节点，绑定新事件
		if(flag){
			//原事件解绑
			lastinputs.off("blur");
			//追加新item
			addItemNumber($addDom);
			//修改itemid
			changeItemNumber();
			//新事件绑定
			bindLastInputEvent(lastinputs);
		}
	});
}

function removedom(dom){
	$(dom).parents("[id^='item']").remove();//取祖先并移除该节点
	changeItemNumber();		//修改itemid
	bindLastInputEvent();	//将事件绑定到最后一组input
}
