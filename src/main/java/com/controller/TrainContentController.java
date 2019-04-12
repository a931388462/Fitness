package com.controller;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;

import com.base.BaseServlet;

@WebServlet("/trainContentController")
@Controller
public class TrainContentController extends BaseServlet{

	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 	response.setContentType("application/json");
		 	InputStream i = request.getInputStream();
	        BufferedReader in = new BufferedReader(new InputStreamReader(i));
	        StringBuffer sb = new StringBuffer("");
	        String temp;
	        while ((temp = in.readLine()) != null) {
	            sb.append(temp);
	        }
	        in.close();
	        System.out.println(sb.toString());
	        
	        //返回json
	        // 转成数据流
	       /* InputStream is = new ByteArrayInputStream(
	                "{\"name\":\"账单\"}".getBytes());
	        // 输出到画面
	        ServletOutputStream op = response.getOutputStream();
	        int len;
	        byte[] buff = new byte[4096];
	        while ((len = is.read(buff)) != -1) {
	            op.write(buff, 0, len);
	        }
	        op.flush();*/
		
		//response.sendRedirect("indexController");
	}

}
