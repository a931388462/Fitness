<!--popup-->
<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
      	<div class="row">
			<div class="col-md-10">
				<h4 class="modal-title" id="myModalLabel">日期</h4>
			</div>
			<div class="col-md-2">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
			</div>
		</div>
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
				        <option>卧推</option>
				        <option>深蹲</option>
				        <option>硬拉</option>
				      </select>
				    </div>
				</div>
			  </div>
			  <div class="col-md-6 form-horizontal">
			  	<div class="form-group">
				    <label for="bb" class="col-md-4 control-label">单位</label>
				    <div class="col-md-8">
				      <select id="bb" class="form-control">
				        <option>LB</option>
				        <option>KG</option>
				      </select>
				    </div>
				</div>
			  </div>
			</div>
			
			<!--一个节点(通过js在画面上显示)-->
			<div id="dom" style="display: none;"> 
				<div class='row' id="item0">
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
					    <div class='col-md-1' onclick="removedom(this)">x</div>
					</div>
				  </div>
				</div>
			</div>
			
      	</div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button type="button" class="btn btn-primary">提交</button>
      </div>
    </div>
  </div>
</div>

<script src="resources/js/trainContentPopup.js"></script>