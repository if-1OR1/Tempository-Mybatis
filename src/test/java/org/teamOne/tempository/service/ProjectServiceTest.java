package org.teamOne.tempository.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.teamOne.tempository.aggregate.Project;
import org.teamOne.tempository.dto.ProjectDTO;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProjectServiceTest {

    @Autowired
    private ProjectService projectService;

    @DisplayName("프로젝트 정보 조회 테스트")
    @Test
    void getProjectInfoByIdTest(){
        ProjectDTO project = new ProjectDTO(1);
        List<Project> projectInfoById = projectService.getProjectInfoById(project);
    }
}