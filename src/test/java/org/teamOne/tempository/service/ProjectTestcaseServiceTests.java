package org.teamOne.tempository.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.teamOne.tempository.aggregate.ProjectTestcase;
import org.teamOne.tempository.dto.ProjectTestcaseDTO;

import java.util.List;


@SpringBootTest
class ProjectTestcaseServiceTests {

    @Autowired
    private ProjectTestcaseService projectTestcaseService;

    @DisplayName("프로젝트id로 테스트케이스 전체 조회")
    @Test
    void findAllProjectTestcaseTest() {
        List<ProjectTestcase> projectTestcases = projectTestcaseService.findAllTestcaseByProjectId(1);

        Assertions.assertNotNull(projectTestcases);
    }

}