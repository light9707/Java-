package cn.web.shopping.mapper;

import java.util.List;

import cn.web.shopping.entity.Article;

/**
 * 持久层的接口，相当于DAO
 * @author pr919
 *
 */
public interface ArticleMapper {
	public List<Article> findAllArticle();
}
