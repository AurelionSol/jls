package com.qpanda.jls.Service;

import com.qpanda.jls.pojo.Article;

import java.util.List;

public interface ArticleService {
    void addArticle(Article article);

    void deleteArticleById(Integer id);

    void updateArticle(Article article);

    Article getArticleById(Integer id);

    List<Article> listAllArticle();

    int getArticleCount();

    List<Article> listArticleByType(String type);

    List<Article> listArticleByAuthorId(Integer authorId);
}
