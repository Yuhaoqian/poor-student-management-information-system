package edu.sqa.finalproject.poorstudentmis.mapper;

import java.util.List;

import edu.sqa.finalproject.poorstudentmis.entity.Article;
import edu.sqa.finalproject.poorstudentmis.entity.Category;

public interface ArticleMapper {
	List<Article> getAllArticle();
	List<Article> getArticleByCategoryId(Integer category_id);
	List<Article> getArticleByStuId(String sid);
	Integer save(Article a);
	Article getArticleById(Integer id);
	
	public void delById(Integer id);
	List<Category> getAllCategory();
}
