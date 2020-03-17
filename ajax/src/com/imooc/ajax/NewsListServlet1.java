package com.imooc.ajax;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.alibaba.fastjson.JSON;

/**
 * Servlet implementation class NewsListServlet
 */
@WebServlet("/news_list1")
public class NewsListServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String title = request.getParameter("title");
		//从session中获取所有新闻
		List<News> list = (List<News>) request.getSession().getAttribute("news");
		//用于存储符合条件的新闻
		List<News> list1 = new ArrayList<News>();
		//查询符合标题的新闻
			
			for(News news : list) {
				if (news.getTitle().equals(title)) {
					list1.add(news);break;
					
				}
			}
			String json = JSON.toJSONString(list1);
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().println(json);
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}