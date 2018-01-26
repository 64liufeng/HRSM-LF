package com.service;


import com.model.User;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/9 0009.
 */
public interface UserService {
    boolean addUser(User user);
    boolean updateUser(User user);
    boolean deleteUser(User user);
    User listUser(User user);
    List<Map<String,Object>> listAll();
    List<User> listUsers();
}
