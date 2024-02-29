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

    /* 설명. manager id - 담당자 id를 이용하여 작성한 wbs 조회 */
    public List<Wbs> findWbsByManagerId(int managerId) {

        List<Wbs> wbsList = wbsMapper.findWbsByManagerId(managerId);
        wbsList.forEach(System.out::println);

        return wbsList;
    }


}
