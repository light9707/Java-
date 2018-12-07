package cn.web.shopping.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.web.shopping.entity.Article;
import cn.web.shopping.mapper.ArticleMapper;
import cn.web.shopping.utils.MyBatisUtil;

public class ShoppingService {
	
	/**
	 *  ��ѯ���в�Ʒ
	 * @return
	 */
	public List<Article> findArticle() {
		SqlSession session = MyBatisUtil.getSession();
		//����һ������ӿڵ�ʵ��
		ArticleMapper mapper = session.getMapper(ArticleMapper.class);
		List<Article> list =  mapper.findAllArticle();	
		MyBatisUtil.closeSession();
		
		return list;
	}
}
