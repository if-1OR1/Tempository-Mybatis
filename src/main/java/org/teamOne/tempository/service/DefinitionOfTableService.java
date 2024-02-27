package org.teamOne.tempository.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.teamOne.tempository.aggregate.DefinitionOfTable;
import org.teamOne.tempository.dao.DefinitionOfTableMapper;
import org.teamOne.tempository.dto.DefinitionOfTableDTO;

import java.util.List;

@Service
public class DefinitionOfTableService {
    private final DefinitionOfTableMapper definitionOfTableMapper;
    private final SqlSessionTemplate sqlSession;

    @Autowired
    public DefinitionOfTableService(DefinitionOfTableMapper definitionOfTableMapper, SqlSessionTemplate sqlSession) {
        this.definitionOfTableMapper = definitionOfTableMapper;
        this.sqlSession = sqlSession;
    }


    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public boolean isDefinitionOfTable(DefinitionOfTableDTO definitionOfTableDTO) {
        DefinitionOfTable definitionOfTable = new DefinitionOfTable(definitionOfTableDTO.getProjectId());

        DefinitionOfTable result = definitionOfTableMapper.isDefinitionOfTable(definitionOfTable);
        if (result != null) {
            return true;
        }
        return false;

    }

    public List<DefinitionOfTableDTO> findAllDefinitionOfTables(int projectID) {
        return sqlSession.getMapper(DefinitionOfTableMapper.class).selectAllDefinitionOfTables(projectID);
    }
}
