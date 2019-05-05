package com.qpanda.jls.Controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.qpanda.jls.Service.CodeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Api(value = "在线编程")
@RequestMapping(value = {"/api/code"})
@RestController
public class CodeController {
    @Autowired
    CodeService codeService;
    @PostMapping("/return")
    @ApiOperation("获取返回值")
    public String getReturn(@RequestBody Map<String,String> code) {
        return  codeService.getReturn(code.get("code"));
    }
}
