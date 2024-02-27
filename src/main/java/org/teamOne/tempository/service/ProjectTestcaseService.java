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




    public List<ProjectTestcase> findAllTestcaseByProjectId(ProjectTestcaseDTO projectTestcaseDTO) {

        ProjectTestcase projectTestcase = new ProjectTestcase(projectTestcaseDTO.getProjectId());
        List<ProjectTestcase> testcases = projectTestcaseMapper.findAllTestcaseByProjectId(projectTestcase);
        testcases.forEach(System.out::println);


        return testcases;
    }
}
