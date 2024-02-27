package org.teamOne.tempository.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.teamOne.tempository.aggregate.Requirement;
import org.teamOne.tempository.dto.RequirementDTO;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RequirementServiceTest {

    @Autowired
    private RequirementService requirementService;

    @DisplayName("요구사항 조회 테스트")
    @Test
    void requirementTest() {
        RequirementDTO requirement = new RequirementDTO(1);
        List<Requirement> selectAll = requirementService.SelectAll(requirement);
        selectAll.forEach(System.out::println);

    }

}