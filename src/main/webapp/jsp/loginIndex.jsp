<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<title>主页</title>
	
	<script src='resources/jquery3.3.1.js' type="text/javascript" charset="utf-8"></script>
	
	<!-- 日历插件 -->
	<link href="resources/calendar/core/main.css" rel='stylesheet' />
	<link href="resources/calendar/daygrid/main.css" rel='stylesheet' />
	<script src='resources/calendar/core/main.js'></script>
	<script src="resources/calendar/daygrid/main.js"></script>
	<script src="resources/calendar/interaction/main.js"></script>
	<script src="resources/calendar/core/locales/zh-cn.js"></script>
	
	<!-- bootstrap -->
	<script src="resources/bootstrap/bootstrap.js"></script>
	<link rel="stylesheet" type="text/css" href="resources/bootstrap/bootstrap.css"/>
	
</head>
<body>
	<div id="calendar" style="min-height:99vh;"></div>
	
	<!-- 引入popup页面 -->
	<c:import url="trainContent/trainContentPopup.jsp"></c:import> 
	<%-- <%@include file="trainContent/trainContentPopup.jsp"%> --%>
	
</body>

<script type="text/javascript">
	//trainDates初期化
	var trainDates = [];
	var trainDate = {};
	
	<c:forEach items="${trainDates}" var="trainDate">
		trainDate = {typename:'${trainDate.typename}',traindateStr:'${trainDate.traindateStr}'};
		trainDates.push(trainDate);
	</c:forEach>
	
	//一个日期的初始化
	var eventSources = [];
	var list = {};
	list.events = [];
	
	for (var i = 0;i<trainDates.length;i++) {
		list.events.push({
			title: trainDates[i].typename
			,start:trainDates[i].traindateStr
			,color: 'black'
			,textColor: 'yellow'
		});
	}
	eventSources.push(list);
	
	//日期插件初始化
	document.addEventListener('DOMContentLoaded', function() {
		var calendarEl = document.getElementById('calendar');
		var calendar = new FullCalendar.Calendar(calendarEl, {
	    	plugins: [ 'dayGrid','interaction' ],
	    	defaultView: 'dayGridMonth',
	    	locale: 'zh-cn',
	    	height:'parent',
	    	eventSources: eventSources,
			dateClick: function(info) {
				//弹出框标题设置
				$('#myModalLabel').html(info.dateStr);
				$('#myModal').modal();
			},
	   });
		calendar.render();
	});
	
	
	function getabcde() {
		$.ajax({
			type : "post",//向后台请求的方式，有post，get两种方法
			url : WWWROOT + "/sys/userMgr/deleteUser",//url填写的是请求的路径
			cache : false,//缓存是否打开
			dataType : 'json',//请求的数据类型
			data : {//请求的数据，
				orgId :OrgId,
				"userIds" : userId
			},
			success : function(data) {//请求的返回成功的方法
				if (data && data.success) {
					alert("已经删除成功。");
				} else {
					alert("删除失败，原因：" + data.msg);
				}
			},
			error : function(XMLHttpRequest, textStatus, errorThrown) {//请求的失败的返回的方法
				alert("删除失败，请稍后再次尝试删除！");
			}
		});
	}
	
</script>

</html>