package org.teamOne.tempository.dao;

import org.teamOne.tempository.aggregate.Wbs;

import java.util.List;

public interface WbsMapper {
    List<Wbs> findAllWbsByProjectId(int projectId);

    List<Wbs> findWbsByManagerId(int managerId);
}
