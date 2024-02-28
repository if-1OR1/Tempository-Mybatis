package org.teamOne.tempository.dao;

import org.apache.ibatis.annotations.Mapper;
import org.teamOne.tempository.aggregate.Project;

import java.util.List;

@Mapper
public interface ProjectMapper {
    List<Project> getProjectInfoById(Project project);
}
