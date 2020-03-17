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
		//�������ϣ���������ӵ�������
		List<News> list = new ArrayList<News>();

		list.add(new News("news1", "2018-5-1", "TIOBE", "..."));
		list.add(new News("news2", "2018-6-1", "TIOBE", "..."));
		list.add(new News("news3", "2018-7-1", "TIOBE", "..."));
		list.add(new News("news4", "2018-8-1", "TIOBE", "..."));
		//�����ϴ洢��session�У���ת����demo.jsp����ʾ
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
