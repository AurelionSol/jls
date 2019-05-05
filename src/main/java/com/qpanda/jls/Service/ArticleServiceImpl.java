package com.qpanda.jls.Service;

import com.qpanda.jls.Dao.ArticleMapper;
import com.qpanda.jls.pojo.Article;
import com.qpanda.jls.pojo.ArticleExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    ArticleMapper articleMapper;

    @Override
    public void addArticle(Article article) {
        articleMapper.insertSelective(article);
    }

    @Override
    public void deleteArticleById(Integer id) {
        articleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateArticle(Article article) {
        articleMapper.updateByPrimaryKeySelective(article);
    }

    @Override
    public Article getArticleById(Integer id) {
        return articleMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Article> listAllArticle() {
        ArticleExample example = new ArticleExample();
        return articleMapper.selectByExample(example);
    }

    @Override
    public int getArticleCount() {
        ArticleExample example = new ArticleExample();
        return articleMapper.selectByExample(example).size();
    }

    @Override
    public List<Article> listArticleByType(String type) {
        ArticleExample example = new ArticleExample();
        ArticleExample.Criteria criteria = example.createCriteria();
        criteria.andArticletypeLike(type);
        return articleMapper.selectByExample(example);
    }

    @Override
    public List<Article> listArticleByAuthorId(Integer authorId) {
        ArticleExample example = new ArticleExample();
        ArticleExample.Criteria criteria = example.createCriteria();
        criteria.andArticleauthorEqualTo(authorId);
        return articleMapper.selectByExample(example);
    }
}
