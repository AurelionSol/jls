package com.qpanda.jls.Service;

import com.qpanda.jls.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {

    void addUser(User User);

    void deleteUserById(Integer id);

    void updateUser(User user);

    User getUserById(Integer id);

    User getUserByToken(String token);

    User getUserByUsername(String username);

    List<User> listAllUser();

    int getUserCount();

}
