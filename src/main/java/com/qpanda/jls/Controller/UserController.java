package com.qpanda.jls.Controller;


import com.qpanda.jls.Service.*;
import com.qpanda.jls.generator.Md5TokenGenerator;
import com.qpanda.jls.pojo.Chapter;
import com.qpanda.jls.pojo.User;
import com.qpanda.jls.pojo.hasLearn;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Api(value = "用户管理")
@RequestMapping(value = {"/admin/user", "/api/user"})
@RestController
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    haslearnService haslearnService;
    @Autowired
    ChapterService chapterService;
    @Autowired
    Md5TokenGenerator tokenGenerator;


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ApiOperation("用户登录接口")
    public String login(@RequestBody User user) {
        String username = user.getUsername();
        String password = user.getPassword();
        User currentUser = userService.getUserByUsername(username);
        if (password.equals(currentUser.getPassword())) {
            return currentUser.getToken();
        } else {
            return null;
        }
    }

    @RequestMapping(value = "/progress/query", method = RequestMethod.GET)
    @ApiOperation("查询用户学习进度")
    public boolean queryLearnProgress(@RequestParam String token, @RequestParam Integer chapterid) {
        int userid = userService.getUserByToken(token).getUserid();
        List<hasLearn> hasLearnList = haslearnService.listhasLearnByUserId(userid);
        for (hasLearn hasleran :
                hasLearnList) {
            if (hasleran.getChapterid() == chapterid) {
                return true;
            }
        }
        return false;
    }



    @RequestMapping(value = "/progress/list", method = RequestMethod.GET)
    @ApiOperation("返回用户学习进度")
    public int getLearnProgress(@RequestParam String token, @RequestParam String type) {
        int count = 0;
        User user = this.getUserByToken(token);
        List<hasLearn> hasLearnList = haslearnService.listhasLearnByUserId(user.getUserid());
        for (hasLearn haslearn : hasLearnList) {
            Chapter chapter = chapterService.getChapterById(haslearn.getChapterid());
            if (chapter.getChaptertype().equals(type)) {
                count++;
            }
        }
        return count;
    }

    @RequestMapping(value = "/progress/add", method = RequestMethod.POST)
    @ApiOperation("新增用户学习进度")
    public void addLearnProgress(@RequestBody Map<String, String> requestbody) {
        hasLearn hasLearn = new hasLearn();
        String token = requestbody.get("token");
        int chapterid = Integer.valueOf(requestbody.get("chapterid"));
        int userid = userService.getUserByToken(token).getUserid();
        hasLearn.setUserid(userid);
        hasLearn.setChapterid(chapterid);
        haslearnService.addhasLearn(hasLearn);
    }


    @GetMapping("/list")
    @ApiOperation("获取用户列表")
    public List<User> getUserList() {
        return userService.listAllUser();
    }

    @ApiOperation("新增用户")
    @PostMapping("/add")
    public void addUser(@RequestBody User user) {
        String token = tokenGenerator.generate(user.getUsername());
        user.setToken(token);
        userService.addUser(user);
    }

    @ApiOperation("查询用户")
    @GetMapping(value = "byId/{id}")
    public User getUser(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

    @ApiOperation("查询用户通过token")
    @GetMapping(value = "/{token}")
    public User getUserByToken(@PathVariable String token) {
        if (token != null)
            return userService.getUserByToken(token);
        else
            return null;
    }

    @ApiOperation("更新用户信息")
    @PutMapping(value = "/{id}")
    public void updateUser(@PathVariable Integer id, @RequestBody User user) {
        userService.updateUser(user);
    }

    @ApiOperation("删除用户")
    @DeleteMapping(value = "/{id}")
    public void deleteUser(@PathVariable Integer id) {
        userService.deleteUserById(id);
    }
}
