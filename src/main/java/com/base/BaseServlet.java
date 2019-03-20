package com.base;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class BaseServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	public void init() throws ServletException {
        super.init();
        ServletContext servletContext = this.getServletContext(); 
        // 解决servlet用@Autowired自动注入service失败的问题
        WebApplicationContext webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(servletContext); 
        AutowireCapableBeanFactory autowireCapableBeanFactory = webApplicationContext.getAutowireCapableBeanFactory(); 
        autowireCapableBeanFactory.autowireBean(this);
    }
}
