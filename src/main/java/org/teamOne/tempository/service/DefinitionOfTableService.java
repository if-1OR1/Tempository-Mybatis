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

    public List<DefinitionOfTable> selectAllDefinitionOfTables(DefinitionOfTableDTO definitionDTO) {

        DefinitionOfTable definitionOfTable = new DefinitionOfTable((definitionDTO.getProjectId()));
        List<DefinitionOfTable> result = definitionOfTableMapper.selectAllDefinitionOfTables(definitionOfTable);

        return result;
    }

    public DefinitionOfTable findByTableId(int tableId) {
        DefinitionOfTable foundTable = definitionOfTableMapper.getDefinitionOfTableById(tableId);

        return foundTable;

    }
}
