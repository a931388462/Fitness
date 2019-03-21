package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.base.BaseServlet;
import com.po.FitnessUser;
import com.service.IndexService;

@WebServlet("/indexController")
@Controller
public class IndexController extends BaseServlet {
	@Autowired
	private IndexService indexService;

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		FitnessUser fitnessUser = new FitnessUser();
		fitnessUser.setUserid(1);
		
		indexService.index(fitnessUser);
		
		
		//request.setAttribute(arg0, arg1);
		request.getRequestDispatcher("/test.jsp").forward(request,response); 
		
		
		
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FitnessUser fitnessUser = new FitnessUser();
		fitnessUser.setUserid(1);
		
		indexService.index(fitnessUser);
		
		
		//request.setAttribute(arg0, arg1);
		request.getRequestDispatcher("/test.jsp").forward(request,response); 
	}
	
}
