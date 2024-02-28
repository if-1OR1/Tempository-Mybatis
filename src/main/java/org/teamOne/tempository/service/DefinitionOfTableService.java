package org.teamOne.tempository.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.teamOne.tempository.aggregate.DefinitionOfTable;
import org.teamOne.tempository.dao.DefinitionOfTableMapper;
import org.teamOne.tempository.dto.DefinitionOfTableDTO;

import java.util.List;


@Service
public class DefinitionOfTableService {
    @Autowired
    private final DefinitionOfTableMapper definitionOfTableMapper;

    @Autowired
    public DefinitionOfTableService(DefinitionOfTableMapper definitionOfTableMapper) {
        this.definitionOfTableMapper = definitionOfTableMapper;
    }

    /* 설명. Project ID로 해당 테이블 정의서 모두 조회 */
    public List<DefinitionOfTable> selectAllDefinitionOfTables(DefinitionOfTableDTO definitionDTO) {

        DefinitionOfTable definitionOfTable = new DefinitionOfTable(definitionDTO.getProjectId());
        List<DefinitionOfTable> result = definitionOfTableMapper.selectAllDefinitionOfTables(definitionOfTable);

        return result;
    }

    /* 설명. Table ID로 해당 테이블 정의서 조회 -> 한 행만 조회 가능(하단에 개선하여 기능 구현) */
    public DefinitionOfTable findByTableId(int tableId) {
        DefinitionOfTable foundTable = definitionOfTableMapper.getDefinitionOfTableById(tableId);

        return foundTable;

    }

    /* 설명. Table Name 으로 해당 테이블 정의서 모두 조회 */
    public List<DefinitionOfTable> selectTableByName(DefinitionOfTableDTO definitionDTO) {
        DefinitionOfTable definitionOfTable = new DefinitionOfTable(definitionDTO.getTableName());
        List<DefinitionOfTable> result = definitionOfTableMapper.selectDefinitionOfTableByName(definitionOfTable);

        return result;
    }
}
