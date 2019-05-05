package com.qpanda.jls.Controller;

import com.qpanda.jls.Service.ArticleService;
import com.qpanda.jls.Service.UserService;
import com.qpanda.jls.pojo.Article;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api(value = "文章管理")
@RequestMapping(value = {"/admin/article","/api/article"})
@RestController
public class ArticleController {
    @Autowired
    ArticleService articleService;
    @Autowired
    UserService userService;

    @GetMapping("/list")
    @ApiOperation("获取文章列表")
    public List<Article> getArticleList() {
        return  articleService.listAllArticle();
    }

    @ApiOperation("新增文章")
    @PostMapping("/add")
    public void addArticle(@RequestBody Map<String,String> requestbody) {
        String content = requestbody.get("content");
        String title = requestbody.get("title");
        String introduction = requestbody.get("introduction");
        String type = requestbody.get("type");
        int userid = userService.getUserByToken(requestbody.get("token")).getUserid();
        Article article = new Article();
        article.setArticletitle(title);
        article.setArticleintroduction(introduction);
        article.setArticletype(type);
        article.setArticleauthor(userid);
        article.setArticlecontent(content);
        articleService.addArticle(article);
    }

    @ApiOperation("查询文章")
    @GetMapping(value = "/{id}")
    public Article getArticle(@PathVariable Integer id) {
        return articleService.getArticleById(id);
    }

    @ApiOperation("更新文章信息")
    @PutMapping(value = "/{id}")
    public void updateArticle(@PathVariable Integer id, @RequestBody Article article) {
        articleService.updateArticle(article);
    }

    @ApiOperation("删除文章")
    @DeleteMapping(value = "/{id}")
    public void deleteArticle(@PathVariable Integer id) {
        articleService.deleteArticleById(id);
    }

    @ApiOperation("获取某种类型文章列表")
    @GetMapping(value ="/list/sort/type/{type}")
    public List<Article> getArticleListByType(@PathVariable String type) {
        return  articleService.listArticleByType(type);
    }

    @ApiOperation("获取某个作者的文章列表")
    @GetMapping(value ="/list/sort/author/{token}")
    public List<Article> getArticleListByAuthor(@PathVariable String token) {
        return  articleService.listArticleByAuthorId(userService.getUserByToken(token).getUserid());
    }


}
