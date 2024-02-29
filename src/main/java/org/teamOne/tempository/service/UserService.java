package org.teamOne.tempository.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.teamOne.tempository.aggregate.ProjectMember;
import org.teamOne.tempository.aggregate.User;
import org.teamOne.tempository.dao.ProjectMemberMapper;
import org.teamOne.tempository.dao.UserMapper;

import java.util.List;

@Service
public class UserService {
    private final UserMapper userMapper;
    private final ProjectMemberMapper projectMemberMapper;

    @Autowired
    public UserService(UserMapper userMapper, ProjectMemberMapper projectMemberMapper) {
        this.userMapper = userMapper;
        this.projectMemberMapper = projectMemberMapper;
    }

    /* 설명. UserId로 사용자 정보 조회 */
    @Transactional
    public User findUserInfoById(int id) {
        User foundUserInfo = userMapper.getUserInfoById(id);

        return foundUserInfo;
    }

    /* 설명. 해당 유저가 참여한 모든 프로젝트 조회 */
    @Transactional
    public List<ProjectMember> findProjectsByUserId(int id) {
        List<ProjectMember> joinProjects = projectMemberMapper.findProjectsByUserId(id);
        joinProjects.forEach(System.out::println);

        return joinProjects;
    }
}
