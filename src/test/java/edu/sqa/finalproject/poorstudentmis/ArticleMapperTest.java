package edu.sqa.finalproject.poorstudentmis;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import edu.sqa.finalproject.poorstudentmis.entity.Article;
import edu.sqa.finalproject.poorstudentmis.mapper.ArticleMapper;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleMapperTest {
	@Autowired
	ArticleMapper articleMapper;
	
//	@Test
//	public void test() {
//		List<Article> as = articleMapper.getAllArticle();
//		System.out.println(as.get(0));
//		System.out.println(as.get(0).getCategory());
//		System.out.println(as.get(0).getS_name());
//
//	}
//	@Test
//	public void test2() {
//		System.out.println("测试根据分类查文章");
//		List<Article> as = articleMapper.getArticleByCategoryId(3);
//		System.out.println(as);
//		System.out.println(as.size());
//
//	}
//	@Test
//	public void insert() {
//		Article a = new Article("测试", "Welcome",0,1,"172219605220");
//		System.out.println(a);
//		articleMapper.save(a);
//	}
//	@Test
//	public void get() {
//		Article a = articleMapper.getArticleById(13);
//		System.out.println(a);
//	}
//	@Test
//	public void test32() {
//		System.out.println("测试根据学生id查文章");
//		List<Article> as = articleMapper.getArticleByStuId("172219605220");
//		System.out.println(as);
//		System.out.println(as.size());
//
//	}
//	@Test
//	public void del() {
//		articleMapper.delById(16);
//	}
	@Test
	public void cate() {
		System.out.println(articleMapper.getAllCategory());
	}
}
