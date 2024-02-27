package org.teamOne.tempository.dao;

import org.apache.ibatis.annotations.Mapper;
import org.teamOne.tempository.aggregate.DefinitionOfTable;

import java.util.List;

@Mapper
public interface DefinitionOfTableMapper {
    List<DefinitionOfTable> selectAllDefinitionOfTables(DefinitionOfTable definitionOfTable);
}
