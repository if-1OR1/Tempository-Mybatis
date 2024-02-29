package org.teamOne.tempository.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.teamOne.tempository.dao.IssueMapper;
@Service
public class IssueService {
    @Autowired
    private final IssueMapper issueMapper;

    @Autowired
    public IssueService(IssueMapper issueMapper) {
        this.issueMapper = issueMapper;
    }

}
