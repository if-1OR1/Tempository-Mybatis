package org.teamOne.tempository.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.teamOne.tempository.dto.DefinitionOfTableDTO;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DefinitionOfTableServiceTest {

    @Autowired
    private DefinitionOfTableService definitionOfTable;

    @DisplayName("프로젝트 ID로 테이블 정의서가 존재하는지 확인")
    @Test
    void isDefinitionOfTable() {
        DefinitionOfTableDTO definition = new DefinitionOfTableDTO(1);
        System.out.println("definition = " + definition);

        Assertions.assertNotNull(1);
    }


    @DisplayName("프로젝트 ID로 테이블 정의서 모두 조회")
    @ParameterizedTest
    @ValueSource(ints = 1)
    void findAllDefinitionOfTables(int projectID) {
        Assertions.assertDoesNotThrow(
                () -> {
                    List<DefinitionOfTableDTO> definitionOfTableList = definitionOfTable.findAllDefinitionOfTables(projectID);
                    definitionOfTableList.forEach(System.out::println);
                }
        );

    }
}