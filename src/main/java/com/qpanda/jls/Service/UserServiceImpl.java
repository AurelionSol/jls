package com.qpanda.jls.Service;

import com.qpanda.jls.Dao.UserMapper;
import com.qpanda.jls.pojo.User;
import com.qpanda.jls.pojo.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements  UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public void addUser(User user) {
        userMapper.insertSelective(user);
    }

    @Override
    public void deleteUserById(Integer id) {
        userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public User getUserById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public User getUserByToken(String token) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria=example.createCriteria();
        criteria.andTokenLike(token);
        return userMapper.selectByExample(example).get(0);
    }

    @Override
    public List<User> listAllUser() {
        UserExample example = new UserExample();
        return userMapper.selectByExample(example);
    }

    @Override
    public int getUserCount() {
        UserExample example = new UserExample();
        return userMapper.selectByExample(example).size();
    }

    @Override
    public User getUserByUsername(String username) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria=example.createCriteria();
        criteria.andUsernameLike(username);
        return userMapper.selectByExample(example).get(0);
    }
}
