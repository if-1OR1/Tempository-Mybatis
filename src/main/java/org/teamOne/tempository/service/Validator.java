package org.teamOne.tempository.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.teamOne.tempository.aggregate.ProjectMember;
import org.teamOne.tempository.dao.ProjectMemberMapper;
import org.teamOne.tempository.dto.ProjectMemberDTO;

@Service
public class Validator {
    private final ProjectMemberMapper projectMemberMapper;

    @Autowired
    public Validator(ProjectMemberMapper projectMemberMapper) {
        this.projectMemberMapper = projectMemberMapper;
    }

    /* 설명. 프로젝트 참여 회원인지 검증하는 메소드, 참여 회원인 경우 true 반환 */
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public boolean isProjectMember(ProjectMemberDTO projectMemberDTO) {
        ProjectMember projectMember = new ProjectMember(projectMemberDTO.getMemberId(), projectMemberDTO.getProjectId());

        ProjectMember result = projectMemberMapper.isProjectMember(projectMember);

        if (result != null) {
            return true;
        }
        return false;
    }
}
