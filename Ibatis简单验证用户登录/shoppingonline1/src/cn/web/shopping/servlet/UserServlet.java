package cn.web.shopping.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.web.shopping.dao.UserDao;
import cn.web.shopping.entity.User;

/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8"); 
		String loginName = request.getParameter("loginName");
		String password = request.getParameter("password");

		UserDao userDao = new UserDao();
		User loginuser = userDao.login(loginName, password);

		if (loginuser != null) {
		
			request.getSession().setAttribute("session_user", loginuser);
		
			response.sendRedirect("ArticleServlet");  
		} else {
			response.sendRedirect("login.jsp");
		}
	}

}
