package com.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.aspectj.lang.annotation.DeclareAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.base.BaseServlet;
import com.po.FitnessUser;
import com.service.LoginService;


@WebServlet("/loginController")
@Controller
public class LoginController extends BaseServlet {
	@Autowired
	private LoginService loginService;

	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("a");
		
		//response.setStatus(307);  
		//response.setHeader("Location", "indexController");  
		
		FitnessUser fitnessUser = new FitnessUser();
		
		loginService.login(fitnessUser);
		
		response.sendRedirect("indexController");
	}
	
}
