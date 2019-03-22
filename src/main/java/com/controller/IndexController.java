package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.base.BaseServlet;
import com.po.FitnessUser;
import com.po.TrainDate;
import com.service.IndexService;
import com.util.DateConversion;

@WebServlet("/indexController")
@Controller
public class IndexController extends BaseServlet {
	@Autowired
	private IndexService indexService;

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		FitnessUser fitnessUser = new FitnessUser();
		fitnessUser.setUserid(1);
		
		List<TrainDate> trainDates = indexService.index(fitnessUser);
		
		//日期变换
		for (TrainDate trainDate : trainDates) {
			trainDate.setTraindateStr(DateConversion.date2String(trainDate.getTraindate(), "yyyy-MM-dd"));
		}
		
		request.setAttribute("trainDates", trainDates);
		
		request.getRequestDispatcher("/jsp/loginIndex.jsp").forward(request,response); 
		
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
	
}
