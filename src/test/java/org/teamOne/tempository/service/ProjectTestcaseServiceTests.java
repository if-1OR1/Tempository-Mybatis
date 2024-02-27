package org.teamOne.tempository.service;

import jdk.jfr.Name;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
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
        ProjectTestcaseDTO projectTestcaseDTO = new ProjectTestcaseDTO(1);
        List<ProjectTestcase> projectTestcases = projectTestcaseService.findAllTestcaseByProjectId(projectTestcaseDTO);

        Assertions.assertNotNull(projectTestcases);
    }

}