package com.imooc.ajax;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SelectServlet
 */
@WebServlet("/SelectServlet")
public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//创建集合，将新闻添加到集合中
		List<News> list = new ArrayList<News>();

		list.add(new News("news1", "2018-5-1", "TIOBE", "..."));
		list.add(new News("news2", "2018-6-1", "TIOBE", "..."));
		list.add(new News("news3", "2018-7-1", "TIOBE", "..."));
		list.add(new News("news4", "2018-8-1", "TIOBE", "..."));
		//将集合存储到session中，并转发到demo.jsp中显示
		request.getSession().setAttribute("news", list);
		request.getRequestDispatcher("/demo.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
