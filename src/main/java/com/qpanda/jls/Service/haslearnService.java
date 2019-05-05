package com.qpanda.jls.Service;

import com.qpanda.jls.pojo.hasLearn;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface haslearnService {
    void addhasLearn(hasLearn hasLearn);

    void deletehasLearnById(Integer id);

    void updatehasLearn(hasLearn hasLearn);

    hasLearn gethasLearnById(Integer id);

    List<hasLearn> listAllhasLearn();

    int gethasLearnCount();

    List<hasLearn> listhasLearnByUserId(Integer userId);
}
