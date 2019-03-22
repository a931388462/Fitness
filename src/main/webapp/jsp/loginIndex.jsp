<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<title>Insert title here</title>

	<link rel='stylesheet' href='resources/calendar/fullcalendar.css' />
	<script src='resources/jquery3.3.1.js' type="text/javascript" charset="utf-8"></script>
	<script src='resources/calendar/moment.min.js' type="text/javascript" charset="utf-8"></script>
	<script src="resources/calendar/fullcalendar.js" type="text/javascript" charset="utf-8"></script>
	<script src="resources/calendar/locale-all.js" type="text/javascript" charset="utf-8"></script>
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
	
	$(function() {
	  	//日历初始化
		$('#calendar').fullCalendar({
		    locale: 'zh-cn',
		    handleWindowResize: false,
		    height:'parent',
		    eventSources: eventSources
		})
	});
</script>

</html>