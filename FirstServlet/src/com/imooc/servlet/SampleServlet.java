package com.imooc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SampleServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String methodName = request.getMethod();
		String name = request.getParameter("name");
		String mobile = request.getParameter("mobile");
		String sex = request.getParameter("sex");
		String[] spec = request.getParameterValues("spec");
		PrintWriter out = response.getWriter();//��������������
		out.println("<h1>method="+methodName+"</h1>");
		out.println("<h1>name="+name+"</h1>");
		out.println("<h1>mobile="+mobile+"</h1>");
		out.println("<h1>sex="+sex+"</h1>");
		for(int i=0 ; i<spec.length ;i++)
		{
			out.println("<h1>spec="+spec[i]+"</h1>");
		}
	}
	
}
