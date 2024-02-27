package org.teamOne.tempository.dao;

import org.apache.ibatis.annotations.Mapper;
import org.teamOne.tempository.aggregate.DefinitionOfTable;
import org.teamOne.tempository.dto.DefinitionOfTableDTO;

import java.util.List;

@Mapper
public interface DefinitionOfTableMapper {
    DefinitionOfTable isDefinitionOfTable(DefinitionOfTable definitionOfTable);

    List<DefinitionOfTableDTO> selectAllDefinitionOfTables(int projectID);
}
