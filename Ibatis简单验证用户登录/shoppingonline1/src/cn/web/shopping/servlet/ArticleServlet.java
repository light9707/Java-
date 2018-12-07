package cn.web.shopping.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cn.web.shopping.entity.Article;
import cn.web.shopping.service.ShoppingService;

/**
 * Servlet implementation class ArticleServlet
 */
public class ArticleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置响应编码类型
		response.setContentType("text/html;charset=UTF-8");
         ShoppingService service=new ShoppingService();
	
		List<Article> list =service.findArticle();
		
	
	//作用域
		request.setAttribute("articleList", list);
	
//跳转
		request.getRequestDispatcher("list.jsp").forward(request, response);
	}

}
