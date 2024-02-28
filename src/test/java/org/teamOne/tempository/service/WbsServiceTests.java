package org.teamOne.tempository.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.teamOne.tempository.aggregate.Wbs;

import java.util.List;

@SpringBootTest
public class WbsServiceTests {

    @Autowired
    private WbsService wbsService;

    @DisplayName("프로젝트 id로 wbs 전체 조회")
    @Test
    void findAllWbsByProjectId() {
        List<Wbs> wbsList = wbsService.findAllWbsByProjectId(1);

        Assertions.assertNotNull(wbsList);
    }

    @DisplayName("담당자 id를 이용하여 작성한 wbs 조회")
    @Test
    void findWbsByManagerId() {
        List<Wbs> wbsList = wbsService.findWbsByManagerId(1);

        Assertions.assertNotNull(wbsList);
    }
}
