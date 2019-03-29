<!--popup-->
<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
      	<h4 class="modal-title" id="myModalLabel">Modal title</h4>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
      </div>
      <div class="modal-body">
      	<div class="container-fluid" id="father">
      		<div class="row">
	  		  <div class="col-md-2 col-md-push-10">容量</div>
			</div>
			<div class="row">
			  <div class="col-md-6 form-horizontal">
			  	<div class="form-group">
				    <label for="aa" class="col-md-4 control-label">train</label>
				    <div class="col-md-8">
				      <select id="aa" class="form-control">
				        <option>Disabled select</option>
				        <option>Disabled select</option>
				        <option>Disabled select</option>
				      </select>
				    </div>
				</div>
			  </div>
			  <div class="col-md-6 form-horizontal">
			  	<div class="form-group">
				    <label for="bb" class="col-md-4 control-label">单位</label>
				    <div class="col-md-8">
				      <select id="bb" class="form-control">
				        <option>Disabled select</option>
				        <option>Disabled select</option>
				        <option>Disabled select</option>
				      </select>
				    </div>
				</div>
			  </div>
			</div>
			
			
			<!--一个节点(通过js在画面显示)-->
			<div id="dom" style="display: none;"> 
				<div class='row' id="item">
				  <div class='col-md-6 form-horizontal'>
				  	<div class='form-group'>
					    <label for='cc' class='col-md-4 control-label'>重量</label>
					    <div class='col-md-8'>
					      <input type='text' name='weight' class='form-control'></input>
					    </div>
					</div>
				  </div>
				  <div class='col-md-6 form-horizontal'>
				  	<div class='form-group'>
					    <label for='cc' class='col-md-4 control-label'>次数</label>
					    <div class='col-md-6'>
					      <input type='text' name='number' class='form-control'></input>
					    </div>
					    <div class='col-md-1'>x</div>
					</div>
				  </div>
				</div>
			</div>
			
      	</div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Save changes</button>
      </div>
    </div>
  </div>
</div>

<script type="text/javascript">
	//初始化条数
	var initNum = 5;
	var $addDom;
	
	$(function(){
		for(var i=1;i<=initNum;i++){
			//取得要添加节点的代码  并将item的id初始化
			$addDom = $("#dom").html().replace(new RegExp("item","g"),"item"+i);//g代表替换所有
			$("#father").append($addDom);
		}
		
		bindLastInputEvent(getLastInput());	
	});
	
	/* 取得最后一组的input */
	function getLastInput() {
		return $("[id^='item']").last().find("input");
	}
	
	/*将事件绑定到最后一组input*/
	function bindLastInputEvent(lastinputs){
		lastinputs.on("blur",function(){
			var flag = true;
			lastinputs.each(function(){
				if(this.value == ""||this.value==null){
					flag = false;
				}
			});
			if(flag){
				//原事件解绑
				lastinputs.off("blur");
				$("#father").append($addDom);
				//新事件绑定
				bindLastInputEvent(getLastInput());
			}
		});
	}
	
</script>