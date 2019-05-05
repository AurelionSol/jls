package com.qpanda.jls.Controller;


import com.qpanda.jls.Service.ChapterService;
import com.qpanda.jls.pojo.Chapter;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "章节管理")
@RequestMapping(value = {"/admin/chapter","/api/chapter"})
@RestController
public class ChapterController {
    @Autowired
    ChapterService chapterService;

    @GetMapping("/list")
    @ApiOperation("获取章节列表")
    public List<Chapter> getArticleList() {
        return  chapterService.listAllChapter();
    }

    @ApiOperation("新增章节")
    @PostMapping("/add")
    public void addChapter(@RequestBody Chapter chapter) {
        chapterService.addChapter(chapter);
    }

    @ApiOperation("查询章节")
    @GetMapping(value = "/{id}")
    public Chapter getChapter(@PathVariable Integer id) {
        return chapterService.getChapterById(id);
    }

    @ApiOperation("更新章节信息")
    @PutMapping(value = "/{id}")
    public void updateChapter(@PathVariable Integer id, @RequestBody Chapter chapter) {
        chapterService.updateChapter(chapter);
    }

    @ApiOperation("删除章节")
    @DeleteMapping(value = "/{id}")
    public void deleteChapter(@PathVariable Integer id) {
        chapterService.deleteChapterById(id);
    }

    @ApiOperation("获取某种类型章节列表")
    @GetMapping(value ="/list/sort/{type}")
    public List<Chapter> getChapterListByType(@PathVariable String type) {
        return  chapterService.listChapterByType(type);
    }

    @ApiOperation("获取某种类型章节列表")
    @GetMapping(value ="/list/count/{type}")
    public int getChapterCountByType(@PathVariable String type) {
        return  chapterService.listChapterCountByType(type);
    }
}
