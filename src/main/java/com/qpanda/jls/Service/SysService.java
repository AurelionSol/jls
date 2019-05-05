package com.qpanda.jls.Service;

import com.qpanda.jls.pojo.SysComment;
import com.qpanda.jls.pojo.SysLog;
import com.qpanda.jls.pojo.SysView;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface SysService {
    void addLog(SysLog sysLog);

    void addView(SysView sysView);

    void addComment(SysComment sysComment);

    int getLogCount();

    int getViewCount();

    int getCommentCount();

    List<SysLog> listAllLog();

    List<SysView> listAllView();

    List<SysComment> listAllComment();

    void deleteCommentById(Integer id);
}
