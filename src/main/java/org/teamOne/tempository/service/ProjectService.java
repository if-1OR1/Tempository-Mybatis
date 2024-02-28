package org.teamOne.tempository.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.teamOne.tempository.aggregate.Project;
import org.teamOne.tempository.dao.ProjectMapper;
import org.teamOne.tempository.dto.ProjectDTO;

import java.util.List;

@Service
public class ProjectService {

    private ProjectMapper projectMapper;

    @Autowired
    public ProjectService(ProjectMapper projectMapper) {
        this.projectMapper = projectMapper;
    }

    /* 설명. ID를 이용하여 프로젝트 정보 조회 */
    public List<Project> getProjectInfoById(ProjectDTO projectDTO){
        Project project = new Project(projectDTO.getId());

        List<Project> result = projectMapper.getProjectInfoById(project);

        result.forEach(System.out::println);

        return result;
    }
}
