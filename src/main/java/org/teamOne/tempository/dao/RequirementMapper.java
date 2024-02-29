package org.teamOne.tempository.dao;

import org.apache.ibatis.annotations.Mapper;
import org.teamOne.tempository.aggregate.Requirement;

import java.util.List;

@Mapper
public interface RequirementMapper {

    List<Requirement> requirementInfoByProjectId(int projectId);

    List<Requirement> requirementInfoBySeparate(String separate);
}
