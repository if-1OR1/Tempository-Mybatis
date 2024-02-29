package org.teamOne.tempository.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.teamOne.tempository.aggregate.Requirement;
import org.teamOne.tempository.dto.RequirementDTO;

import java.util.List;

@SpringBootTest
class RequirementServiceTest {

    @Autowired
    private RequirementService requirementService;

    @DisplayName("요구사항 조회 테스트")
    @Test
    void requirementInfoByProjectIdTest() {
        List<Requirement> result = requirementService.requirementInfoByProjectId(1);

        Assertions.assertNotNull(result);
    }

    @DisplayName("요구사항 조회 테스트")
    @Test
    void requirementInfoBySeparate() {
        String separate1= "사용자";
        String separate2 = "상품";

        List<Requirement> findBySeparate1 = requirementService.requirementInfoBySeparate(separate1);
        List<Requirement> findBySeparate2 = requirementService.requirementInfoBySeparate(separate2);

        Assertions.assertNotNull(findBySeparate1);
        Assertions.assertNotNull(findBySeparate2);
    }

}