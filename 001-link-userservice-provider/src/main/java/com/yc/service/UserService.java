package com.yc.service;

import com.yc.beans.User;

public interface UserService {
    /**
     * 根据用户标识获取用户id
     * @param id
     * @return
     */
    User queryUserById(Integer id);
}
