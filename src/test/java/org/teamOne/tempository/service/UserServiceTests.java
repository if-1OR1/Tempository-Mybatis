package org.teamOne.tempository.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.teamOne.tempository.aggregate.User;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTests {

    @Autowired
    private UserService userService;

    @DisplayName("유저 정보 조회 테스트")
    @Test
    void findUserInfoTest() {
        int userId = 1;

        User foundUserInfo = userService.findUserInfoById(userId);
        System.out.println("foundUserInfo = " + foundUserInfo);

        assertEquals(foundUserInfo.getName(), "김유진");
    }
}