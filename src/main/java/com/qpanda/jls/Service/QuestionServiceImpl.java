package com.qpanda.jls.Service;

import com.qpanda.jls.Dao.QuestionMapper;
import com.qpanda.jls.pojo.Question;
import com.qpanda.jls.pojo.QuestionExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    QuestionMapper questionMapper;
    @Override
    public void addQuestion(Question question) {
        questionMapper.insertSelective(question);
    }

    @Override
    public void deleteQuestionById(Integer id) {
        questionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateQuestion(Question question) {
        questionMapper.updateByPrimaryKeySelective(question);
    }

    @Override
    public Question getQuestionById(Integer id) {
        return questionMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Question> listAllQuestion() {
        QuestionExample example = new QuestionExample();
        return questionMapper.selectByExample(example);
    }

    @Override
    public List<Question> listQuestionByTypeAndStar(String type,String star) {
        QuestionExample example = new QuestionExample();
        QuestionExample.Criteria criteria=example.createCriteria();
        if (!type.equals("全部")){
            criteria.andQuestiontypeLike(type);
        }
        if (!star.equals("0")){
            criteria.andQuestionstarLike(star);
        }
        return questionMapper.selectByExample(example);
    }

    @Override
    public int getQuestionCount() {
        QuestionExample example = new QuestionExample();
        return questionMapper.selectByExample(example).size();
    }
}
