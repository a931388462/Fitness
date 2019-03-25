<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<title>主页</title>
	
	<link href="resources/calendar/core/main.css" rel='stylesheet' />
	<link href="resources/calendar/daygrid/main.css" rel='stylesheet' />
	
	<script src='resources/calendar/core/main.js'></script>
	<script src="resources/calendar/daygrid/main.js"></script>
	<script src="resources/calendar/interaction/main.js"></script>
	<script src="resources/calendar/core/locales/zh-cn.js" type="text/javascript" charset="utf-8"></script>
	
	<script src='resources/jquery3.3.1.js' type="text/javascript" charset="utf-8"></script>
	
</head>
<body>
	<div id="calendar" style="min-height:99vh;"></div>
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
	
	document.addEventListener('DOMContentLoaded', function() {
		var calendarEl = document.getElementById('calendar');
		var calendar = new FullCalendar.Calendar(calendarEl, {
	    	plugins: [ 'dayGrid','interaction' ],
	    	defaultView: 'dayGridMonth',
	    	locale: 'zh-cn',
	    	height:'parent',
	    	eventSources: eventSources,
			dateClick: function(info) {
				alert('clicked ' + info.dateStr);
			},
	   });
		calendar.render();
	});
	
</script>

</html>