package org.teamOne.tempository.dao;

import org.apache.ibatis.annotations.Mapper;
import org.teamOne.tempository.aggregate.ProjectTestcase;
import org.teamOne.tempository.dto.ProjectTestcaseDTO;

import java.util.List;

@Mapper
public interface ProjectTestcaseMapper {
    List<ProjectTestcase> findAllTestcaseByProjectId(int projectId);

    List<ProjectTestcase> findAllTestcaseBySeparate(String separate);
}
