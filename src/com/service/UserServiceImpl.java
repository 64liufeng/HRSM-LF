package com.service;


import com.dao.UserDao;
import com.model.User;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/9 0009.
 */
public class UserServiceImpl implements UserService {
  private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean addUser(User user) {

        return userDao.addUser(user);
    }

    @Override
    public boolean updateUser(User user) {
        return false;
    }

    @Override
    public boolean deleteUser(User user) {
        return false;
    }

    @Override
    public User listUser(User user) {

        return userDao.listUser(user);
    }

    @Override
    public List<Map<String,Object>> listAll() {
        return userDao.listAll();
    }

    @Override
    public List<User> listUsers() {

        return userDao.listUsers();
    }
}
