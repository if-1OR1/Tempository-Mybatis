package org.teamOne.tempository.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.teamOne.tempository.aggregate.User;
import org.teamOne.tempository.dao.UserMapper;

@Service
public class UserService {
    private final UserMapper userMapper;

    @Autowired
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Transactional
    public User findUserInfoById(int id) {
        User foundUserInfo = userMapper.getUserInfoById(id);

        return foundUserInfo;
    }
}
