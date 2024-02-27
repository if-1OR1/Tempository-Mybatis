package org.teamOne.tempository.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.teamOne.tempository.aggregate.Wbs;
import org.teamOne.tempository.dto.WbsDTO;

import java.util.List;

@SpringBootTest
public class WbsServiceTests {

    @Autowired
    private WbsService wbsService;

    @DisplayName("프로젝트 id로 wbs 전체 조회")
    @Test
    void findAllWbsByProjectId() {
        WbsDTO wbsDTO = new WbsDTO(1);
        List<Wbs> wbsList = wbsService.findAllWbsByProjectId(wbsDTO);

        Assertions.assertNotNull(wbsList);
    }
}
