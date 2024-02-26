package org.teamOne.tempository.dao;

import org.apache.ibatis.annotations.Mapper;
import org.teamOne.tempository.aggregate.ProjectMember;

@Mapper
public interface ProjectMemberMapper {
    ProjectMember isProjectMember(ProjectMember projectMember);
}
