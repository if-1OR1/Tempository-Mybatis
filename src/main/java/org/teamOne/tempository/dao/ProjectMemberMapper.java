package org.teamOne.tempository.dao;

import org.apache.ibatis.annotations.Mapper;
import org.teamOne.tempository.aggregate.ProjectMember;

import java.util.List;

@Mapper
public interface ProjectMemberMapper {
    ProjectMember isProjectMember(ProjectMember projectMember);

    List<ProjectMember> findProjectsByUserId(int id);
}
