package org.teamOne.tempository.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.teamOne.tempository.aggregate.Requirement;
import org.teamOne.tempository.dao.RequirementMapper;
import org.teamOne.tempository.dto.RequirementDTO;

import java.util.ArrayList;
import java.util.List;

@Service
public class RequirementService {
    private RequirementMapper requirementMapper;

    @Autowired
    public RequirementService(RequirementMapper requirementMapper) {
        this.requirementMapper = requirementMapper;
    }

    public List<Requirement> SelectAll(RequirementDTO requirement) {
        Requirement requirements = new Requirement(requirement.getProject_id());


        List<Requirement> result = requirementMapper.selectAll(requirements);


        System.out.println(result);
        return result;
    }
}

