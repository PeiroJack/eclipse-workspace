package com.imooc.servlet;

import java.io.IOException;
import java.util.Objects;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SelectServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(Objects.equals("/Demo/Add.do", req.getServletPath())) {
			System.out.println("����/Demo/Add.do����·��");
		}else if(Objects.equals("/Demo/Select.do", req.getServletPath())) {
			System.out.println("����/Demo/Select.do����·��");
		}
	}
	
}
