;
//取得要添加节点的代码
var $addDom = $("#dom").html();

//item初始化
$(function(){
	//初始化条数
	var initNum = 5;
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

//ajax发送trainContents
function sendTrainContents() {
	$.ajax({
		type : "post",//请求方式
		contentType: "text/html;charset=UTF-8",
		url : basePath + "/trainContentController",//url
		cache : false,//缓存
		dataType : 'json',//请求的数据类型
		data : {//请求的数据，
			/*aa : [{}],*/
			trainContents : JSON.stringify(getTrainContents()),
		},
		success : function(data) {//请求成功
			if (data && data.success) {
				alert("已经删除成功。");
			} else {
				alert("删除失败，原因：" + data.msg);
			}
		},
		error : function(XMLHttpRequest, textStatus, errorThrown) {//请求失败
			alert("删除失败，请稍后再次尝试删除！");
		}
	});
}

//trainContents取得
function getTrainContents () {
	var trainContent = {};
	var trainContents = [];
	
	$("[id^='item']").each(function(i) {
		if(i != 0){
			trainContent.typeid = $("#typeid").val();
			trainContent.unit = $("#unit").val();
			trainContent.weight = $(this).find("[name='weight']").val();
			trainContent.number = $(this).find("[name='number']").val();
			trainContents.push(trainContent);
		}
	});
	
	return trainContents;
}