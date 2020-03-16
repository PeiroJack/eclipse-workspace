package com.imooc.jstl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test4
 */
@WebServlet("/test4")
public class Test4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Notice> notices = new ArrayList<Notice>();
		Notice not1 = new Notice("003","一定要多写代码，多练习哟！");
		Notice not2 = new Notice("002","欢迎学习Java Web课程！");
		Notice not3 = new Notice("001","欢迎来到慕课网！");
		notices.add(not1);
		notices.add(not2);
		notices.add(not3);
		request.setAttribute("notices", notices);
		request.getRequestDispatcher("/test4.jsp").forward(request, response);
	}

}
