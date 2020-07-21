package com.yc.service;

import com.yc.beans.User;

public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(1001);
        user.setAge(23);
        user.setName("zs");
        return user;
    }
}
