package com.qpanda.jls.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class HelloController {

    @RequestMapping(value ="/hello")
    public String hello()  {
        return  "hello";
    }

    @RequestMapping(value ="/admin")
    public String adminIndex()  {
        return  "adminIndex";
    }

    @RequestMapping(value ="/adminUser")
    public String adminUser()  {
        return  "adminUser";
    }

    @RequestMapping(value ="/adminChapter")
    public String adminChapter()  {
        return  "adminChapter";
    }

    @RequestMapping(value ="/adminQuestion")
    public String adminQuestion()  {
        return  "adminQuestion";
    }

    @RequestMapping(value ="/adminArticle")
    public String adminArticle()  {
        return  "adminArticle";
    }
}
