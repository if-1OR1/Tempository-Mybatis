package org.teamOne.tempository.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.teamOne.tempository.aggregate.Requirement;
import org.teamOne.tempository.dao.RequirementMapper;
import org.teamOne.tempository.dto.RequirementDTO;

import java.util.List;

@Service
public class RequirementService {
    private RequirementMapper requirementMapper;

    @Autowired
    public RequirementService(RequirementMapper requirementMapper) {
        this.requirementMapper = requirementMapper;
    }

    /* 설명. 프로젝트ID로 요구사항 명세서 내용 조회 */
    public List<Requirement> requirementInfoByProjectId(int projectId) {
        List<Requirement> findByProjectId = requirementMapper.requirementInfoByProjectId(projectId);

        findByProjectId.forEach(System.out::println);

        return findByProjectId;
    }

    /* 설명. 요구사항 구분으로 요구사항 명세서 내용 조회 */
    public List<Requirement> requirementInfoBySeparate(String separate) {

        List<Requirement> findBySeparate = requirementMapper.requirementInfoBySeparate(separate);

        findBySeparate.forEach(System.out::println);

        return findBySeparate;
    }
}

