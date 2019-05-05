package com.qpanda.jls.Service;

import com.qpanda.jls.pojo.Chapter;

import java.util.List;

public interface ChapterService {
    void addChapter(Chapter chapter);

    void deleteChapterById(Integer id);

    void updateChapter(Chapter chapter);

    Chapter getChapterById(Integer id);

    List<Chapter> listAllChapter();

    List<Chapter> listChapterByType(String type);

    int getChapterCount();

   int listChapterCountByType(String type);
}
