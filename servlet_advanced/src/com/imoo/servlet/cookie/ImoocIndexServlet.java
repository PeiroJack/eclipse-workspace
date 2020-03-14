package com.imoo.servlet.cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ImoocIndexServlet
 */
@WebServlet("/cookies/index")
public class ImoocIndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ImoocIndexServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cs = request.getCookies();
		String user = null;
		if(cs == null) {
			response.getWriter().println("user not login");
		}
		for(Cookie cookie : cs) {
			System.out.println(cookie.getName()+":"+cookie.getValue());
			if(cookie.getName().equals("user")) {
				user=cookie.getValue();
				break;
			}
		}
		if(user == null) {
			response.getWriter().println("user not login");
		}else {
			response.getWriter().println("user:"+user);
		}
	}

}
