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
		//������Ӧ��������
		response.setContentType("text/html;charset=UTF-8");
         ShoppingService service=new ShoppingService();
	
		List<Article> list =service.findArticle();
		
	
	//������
		request.setAttribute("articleList", list);
	
//��ת
		request.getRequestDispatcher("list.jsp").forward(request, response);
	}

}
