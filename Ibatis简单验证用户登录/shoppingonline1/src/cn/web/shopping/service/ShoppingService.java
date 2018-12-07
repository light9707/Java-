package cn.web.shopping.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.web.shopping.entity.Article;
import cn.web.shopping.mapper.ArticleMapper;
import cn.web.shopping.utils.MyBatisUtil;

public class ShoppingService {
	
	/**
	 *  查询所有产品
	 * @return
	 */
	public List<Article> findArticle() {
		SqlSession session = MyBatisUtil.getSession();
		//返回一个代理接口的实例
		ArticleMapper mapper = session.getMapper(ArticleMapper.class);
		List<Article> list =  mapper.findAllArticle();	
		MyBatisUtil.closeSession();
		
		return list;
	}
}
