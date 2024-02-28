package org.teamOne.tempository.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.teamOne.tempository.aggregate.ProjectTestcase;
import org.teamOne.tempository.dao.ProjectTestcaseMapper;
import org.teamOne.tempository.dto.ProjectTestcaseDTO;

import java.util.List;

@Service
public class ProjectTestcaseService {

    private final ProjectTestcaseMapper projectTestcaseMapper;

    @Autowired
    public ProjectTestcaseService(ProjectTestcaseMapper projectTestcaseMapper) {
        this.projectTestcaseMapper = projectTestcaseMapper;
    }

    /* 설명. projectId를 이용하여 해당 테스트케이스 전체 조회 */
    public List<ProjectTestcase> findAllTestcaseByProjectId(int projectId) {
        List<ProjectTestcase> projectTestcases = projectTestcaseMapper.findAllTestcaseByProjectId(projectId);
        projectTestcases.forEach(System.out::println);

        return projectTestcases;
    }

    /* 설명. 테스트_구분으로 해당 테스트케이스 조회 */
    public List<ProjectTestcase> findAllTestcaseBySeparate(String separate) {
        List<ProjectTestcase> projectTestcases = projectTestcaseMapper.findAllTestcaseBySeparate(separate);
        projectTestcases.forEach(System.out::println);

        return projectTestcases;
    }
}
