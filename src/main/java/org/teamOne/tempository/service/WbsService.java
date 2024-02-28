package org.teamOne.tempository.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.teamOne.tempository.aggregate.Wbs;
import org.teamOne.tempository.dao.WbsMapper;

import java.util.List;

@Service
public class WbsService {

    private final WbsMapper wbsMapper;

    @Autowired
    public WbsService(WbsMapper wbsMapper) {
        this.wbsMapper = wbsMapper;
    }

    /* 설명. projectId를 이용하여 wbs 전체 조회 */
    public List<Wbs> findAllWbsByProjectId(int projectId) {

        List<Wbs> wbsList = wbsMapper.findAllWbsByProjectId(projectId);
        wbsList.forEach(System.out::println);

        return wbsList;
    }



}
