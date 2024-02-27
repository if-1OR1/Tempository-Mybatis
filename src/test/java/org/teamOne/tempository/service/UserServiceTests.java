package org.teamOne.tempository.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.teamOne.tempository.aggregate.ProjectMember;
import org.teamOne.tempository.aggregate.User;

import java.util.List;

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

    @DisplayName("유저가 참여중인 프로젝트 조회 테스트")
    @Test
    void findProjectsByUserIdTest() {
        List<ProjectMember> foundProjects = userService.findProjectsByUserId(1);

        assertNotNull(foundProjects);
    }
}