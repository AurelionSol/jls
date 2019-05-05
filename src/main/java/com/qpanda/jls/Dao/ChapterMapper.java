package com.qpanda.jls.Dao;

import com.qpanda.jls.pojo.Chapter;
import com.qpanda.jls.pojo.ChapterExample;
import java.util.List;

public interface ChapterMapper {
    int deleteByPrimaryKey(Integer chapterid);

    int insert(Chapter record);

    int insertSelective(Chapter record);

    List<Chapter> selectByExampleWithBLOBs(ChapterExample example);

    List<Chapter> selectByExample(ChapterExample example);

    Chapter selectByPrimaryKey(Integer chapterid);

    int updateByPrimaryKeySelective(Chapter record);

    int updateByPrimaryKeyWithBLOBs(Chapter record);

    int updateByPrimaryKey(Chapter record);
}