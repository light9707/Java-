package cn.web.shopping.test;

import cn.web.shopping.entity.Article;
import cn.web.shopping.mapper.ArticleMapper;
import cn.web.shopping.utils.MyBatisUtil;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
public class TestUser {
	public static void main(String[] args) {

		SqlSession session = MyBatisUtil.getSession();
		ArticleMapper mapper = session.getMapper(ArticleMapper.class);
		List<Article> list =  mapper.findAllArticle();
		for (Article article : list) {
			System.out.println(article.getId() + "," + article.getTitle());
		}
		
		MyBatisUtil.closeSession();
	}
		
}
