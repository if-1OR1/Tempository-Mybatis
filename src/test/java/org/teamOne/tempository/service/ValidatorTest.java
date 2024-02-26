package org.teamOne.tempository.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.teamOne.tempository.dto.ProjectMemberDTO;

@SpringBootTest
class ValidatorTest {

    @Autowired
    private Validator validator;

    @DisplayName("프로젝트 멤버가 맞는지 테스트")
    @Test
    void isProjectMemberTest() {
        ProjectMemberDTO projectMember = new ProjectMemberDTO(1, 1);
        Assertions.assertTrue(validator.isProjectMember(projectMember));
    }

    @DisplayName("프로젝트 멤버가 아닌지 테스트")
    @Test
    void isNotProjectMemberTest() {
        ProjectMemberDTO projectMember = new ProjectMemberDTO(999, 999);
        Assertions.assertFalse(validator.isProjectMember(projectMember));
    }
}