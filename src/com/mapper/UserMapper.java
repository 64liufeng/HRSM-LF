package com.mapper;


import com.model.User;

/**
 * Created by Administrator on 2018/1/22 0022.
 */
public interface UserMapper {
    boolean addUser(User user);
    User getUserByID(User user);
}
