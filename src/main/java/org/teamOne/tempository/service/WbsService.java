package org.teamOne.tempository.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.teamOne.tempository.aggregate.Wbs;
import org.teamOne.tempository.dao.WbsMapper;
import org.teamOne.tempository.dto.WbsDTO;

import java.util.List;

@Service
public class WbsService {

    private WbsMapper wbsMapper;

    @Autowired
    public WbsService(WbsMapper wbsMapper) {
        this.wbsMapper = wbsMapper;
    }

    public List<Wbs> findAllWbsByProjectId(WbsDTO wbsDTO) {

        Wbs wbs = new Wbs(wbsDTO.getProjectId());
        List<Wbs> wbsList = wbsMapper.findAllWbsByProjectId(wbs);
        wbsList.forEach(System.out::println);

        return wbsList;
    }

}
