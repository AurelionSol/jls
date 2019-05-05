package com.qpanda.jls.Service;

import com.qpanda.jls.Dao.ChapterMapper;
import com.qpanda.jls.pojo.Chapter;
import com.qpanda.jls.pojo.ChapterExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChapterServiceImpl implements ChapterService{

    @Autowired
    ChapterMapper chapterMapper;

    @Override
    public void addChapter(Chapter chapter) {
        chapterMapper.insertSelective(chapter);
    }

    @Override
    public void deleteChapterById(Integer id) {
        chapterMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateChapter(Chapter chapter) {
        chapterMapper.updateByPrimaryKeySelective(chapter);
    }

    @Override
    public Chapter getChapterById(Integer id) {
        return chapterMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Chapter> listAllChapter() {
        ChapterExample example = new ChapterExample();
        return chapterMapper.selectByExample(example);
    }

    @Override
    public int getChapterCount() {
        ChapterExample example = new ChapterExample();
        return chapterMapper.selectByExample(example).size();
    }

    @Override
    public List<Chapter> listChapterByType(String type) {
        String theType="";
        switch (type){
            case "basic":
                theType="Java基础";
                break;
            case "junior":
                theType="Java初级";
                break;
            case "middle":
                theType="Java中级";
                break;
            case "senior":
                theType="Java高级";
                break;
            case "apply":
                theType="Java应用";
                break;
            case "fore":
                theType="前端部分";
                break;
            case "j2ee":
                theType="J2EE";
                break;
            case "frame":
                theType="Java框架";
                break;
            case "tool":
                theType="工具及中间件";
                break;
            case "database":
                theType="数据库";
                break;
        }
        ChapterExample example = new ChapterExample();
        ChapterExample.Criteria criteria=example.createCriteria();
        criteria.andChaptertypeLike(theType);
        return chapterMapper.selectByExample(example);
    }

    @Override
    public int listChapterCountByType(String type) {
        ChapterExample example = new ChapterExample();
        ChapterExample.Criteria criteria=example.createCriteria();
        criteria.andChaptertypeLike(type);
        return chapterMapper.selectByExample(example).size();
    }
}
