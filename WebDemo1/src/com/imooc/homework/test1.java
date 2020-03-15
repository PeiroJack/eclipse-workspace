package com.imooc.homework;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class test1
 */
@WebServlet("/test1")
public class test1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public test1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HashMap<String,String> wordMap=new HashMap();
		wordMap.put("apple", "Æ»¹û");
		wordMap.put("banana","Ïã½¶");
		wordMap.put("melon","¹Ï");
		String word = request.getParameter("word");
		String word_cn =wordMap.get(word);
		if(word_cn == null) {
			request.getSession().setAttribute("word", word);
			response.sendRedirect("/fail.jsp");
		}else {
			request.setAttribute("word_cn", word_cn);
			request.getRequestDispatcher("success.jsp").forward(request, response);
		}
	}

}
