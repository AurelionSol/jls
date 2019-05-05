package com.qpanda.jls.Service;

import com.qpanda.jls.pojo.Question;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface QuestionService {
    void addQuestion(Question question);

    void deleteQuestionById(Integer id);

    void updateQuestion(Question question);

    Question getQuestionById(Integer id);

    List<Question> listAllQuestion();

    int getQuestionCount();

    List<Question> listQuestionByTypeAndStar(String type,String star);
}
