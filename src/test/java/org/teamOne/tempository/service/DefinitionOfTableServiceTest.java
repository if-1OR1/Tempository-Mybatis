package org.teamOne.tempository.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.teamOne.tempository.aggregate.DefinitionOfTable;
import org.teamOne.tempository.dto.DefinitionOfTableDTO;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DefinitionOfTableServiceTest {

    @Autowired
    private DefinitionOfTableService definitionOfTableService;

    @DisplayName("프로젝트 ID에 해당하는 테이블 정의서 조회")
    @Test
    void selectAllDefinitionOfTables() {
        DefinitionOfTableDTO definitionDTO = new DefinitionOfTableDTO(1);
        List<DefinitionOfTable> selectAllDefinition = definitionOfTableService.selectAllDefinitionOfTables(definitionDTO);
        selectAllDefinition.forEach(System.out::println);
    }

    @DisplayName("테이블 ID에 해당하는 테이블 정의서")
    @Test
    void selectByTableId() {
        int tableId = 1;
        DefinitionOfTable foundTable = definitionOfTableService.findByTableId(tableId);
        assertEquals(foundTable.getTableName(), "테이블명1");
        System.out.println("foundTable = " + foundTable);
    }
}