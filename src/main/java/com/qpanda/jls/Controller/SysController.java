package com.qpanda.jls.Controller;

import com.qpanda.jls.Service.SysService;
import com.qpanda.jls.pojo.SysComment;
import com.qpanda.jls.pojo.SysLog;
import com.qpanda.jls.pojo.SysView;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/sys")
public class SysController {


    @Autowired
    SysService sysService;

    /**
     * 返回所有的系统日志记录信息
     *
     * @return
     */
    @ApiOperation("返回所有的SysLog信息")
    @GetMapping("/log")
    public List<SysLog> listAllLog() {
        return sysService.listAllLog();
    }

    /**
     * 返回所有的系统浏览记录信息
     *
     * @return
     */
    @ApiOperation("返回所有的SysView信息")
    @GetMapping("/view")
    public List<SysView> listAllView() {
        return sysService.listAllView();
    }

    @ApiOperation("获取所有的留言信息")
    @GetMapping("/comment")
    public List<SysComment> listAllComment() { return sysService.listAllComment();}

    @ApiOperation("删除一条留言")
    @ApiImplicitParam(name = "syscommentid", value = "评论/留言ID", required = true, dataType = "Integer")
    @DeleteMapping("comment/{id}")
    public String deleteComment(@PathVariable Integer id) {
        sysService.deleteCommentById(id);
        return null;
    }

}
