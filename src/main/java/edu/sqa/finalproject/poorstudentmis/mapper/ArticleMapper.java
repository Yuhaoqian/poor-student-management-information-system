package edu.sqa.finalproject.poorstudentmis.mapper;

import java.util.List;

import edu.sqa.finalproject.poorstudentmis.entity.Article;
import edu.sqa.finalproject.poorstudentmis.entity.Category;
import edu.sqa.finalproject.poorstudentmis.entity.Comment;

public interface ArticleMapper {
	List<Article> getAllArticle();
	
	List<Article> getLatestArticle();
	List<Article> getHotestArticle();

	List<Article> getArticleByCategoryId(Integer category_id);
	List<Article> getArticleByStuId(String sid);
	
	List<Article> getArticleByKeyword(String keyword);
	Integer save(Article a);
	Article getArticleById(Integer id);
	
	void delById(Integer id);
	List<Category> getAllCategory();
	Category getCategoryById(Integer id);
	
	void like(Integer id);
	void star(Integer id);
	void view(Integer id);
	
	void save_comment(Comment comment);
	List<Comment> getCommentByArticleId(Integer id);
	
}
