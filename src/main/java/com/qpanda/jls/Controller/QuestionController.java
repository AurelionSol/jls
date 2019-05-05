package com.qpanda.jls.Controller;


import com.qpanda.jls.Service.QuestionService;
import com.qpanda.jls.Service.UserService;
import com.qpanda.jls.Service.wrongItemService;
import com.qpanda.jls.pojo.Question;
import com.qpanda.jls.pojo.Wrongitem;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Api(value = "题库管理")
@RequestMapping(value = {"/admin/question", "/api/question"})
@RestController
public class QuestionController {
    @Autowired
    QuestionService questionService;
    @Autowired
    wrongItemService wrongItemService;
    @Autowired
    UserService userService;

    @GetMapping("/list")
    @ApiOperation("获取题目列表")
    public List<Question> getQuestionList() {
        return questionService.listAllQuestion();
    }

    @ApiOperation("新增题目")
    @PostMapping("/add")
    public void addQuestion(@RequestBody Question question) {
        questionService.addQuestion(question);
    }

    @ApiOperation("查询题目")
    @GetMapping(value = "/{id}")
    public Question getQuestion(@PathVariable Integer id) {
        return questionService.getQuestionById(id);
    }

    @ApiOperation("更新题目信息")
    @PutMapping(value = "/{id}")
    public void updateQuestion(@PathVariable Integer id, @RequestBody Question question) {
        questionService.updateQuestion(question);
    }

    @ApiOperation("删除题目")
    @DeleteMapping(value = "/{id}")
    public void deleteQuestion(@PathVariable Integer id) {
        questionService.deleteQuestionById(id);
    }

    @ApiOperation("获取某种类型题目列表")
    @GetMapping(value = "/list/sort")
    public List<Question> getQuestionListByTypeAndStar(@RequestParam String type, @RequestParam String star) {
        return questionService.listQuestionByTypeAndStar(type, star);
    }

    @ApiOperation("获取错题集列表")
    @GetMapping(value = "/list/wrong/{token}")
    public List<Question> getWrongQusetionList(@PathVariable String token) {
        int userid = userService.getUserByToken(token).getUserid();
        List<Wrongitem> wrongitemList = wrongItemService.listWrongitemByUserId(userid);
        List<Question> questionList = new ArrayList<>();
        for (Wrongitem wrongitem :
                wrongitemList) {
            questionList.add(questionService.getQuestionById(wrongitem.getWrongQuestionid()));
        }
        return questionList;
    }

    @ApiOperation("查询是否加入错题集")
    @GetMapping(value = "/query/wrong")
    public boolean queryWrongItem(@RequestParam String token, @RequestParam Integer questionId) {
        int userid = userService.getUserByToken(token).getUserid();
        List<Wrongitem> wrongitemList = wrongItemService.listWrongitemByUserId(userid);
        for (Wrongitem wrongitem :
                wrongitemList) {
            if (wrongitem.getWrongQuestionid() == questionId) {
                return true;
            }
        }
        return false;
    }

    @RequestMapping(value = "/add/wrong", method = RequestMethod.POST)
    @ApiOperation("将题目加入错题集")
    public void addLearnProgress(@RequestBody Map<String, String> requestbody) {
        Wrongitem wrongitem = new Wrongitem();
        String token = requestbody.get("token");
        int questionId = Integer.valueOf(requestbody.get("questionid"));
        int userid = userService.getUserByToken(token).getUserid();
        wrongitem.setWrongUserid(userid);
        wrongitem.setWrongQuestionid(questionId);
        wrongItemService.addWrongitem(wrongitem);
    }

}
