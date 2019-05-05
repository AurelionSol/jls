package com.qpanda.jls.Dao;

import com.qpanda.jls.pojo.Article;
import com.qpanda.jls.pojo.ArticleExample;
import java.util.List;

public interface ArticleMapper {
    int deleteByPrimaryKey(Integer articleid);

    int insert(Article record);

    int insertSelective(Article record);

    List<Article> selectByExampleWithBLOBs(ArticleExample example);

    List<Article> selectByExample(ArticleExample example);

    Article selectByPrimaryKey(Integer articleid);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKeyWithBLOBs(Article record);

    int updateByPrimaryKey(Article record);
}