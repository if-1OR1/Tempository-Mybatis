package org.teamOne.tempository.dto;

import java.util.Date;

public class WbsDTO {

    private int id;
    private int wbsNo;
    private String content;
    private String taskStatus;
    private Date startDate;
    private Date endDate;
    private int managerId;
    private int projectId;

    public WbsDTO() {
    }

    public WbsDTO(int id, int wbsNo, String content, String taskStatus, Date startDate, Date endDate, int managerId, int projectId) {
        this.id = id;
        this.wbsNo = wbsNo;
        this.content = content;
        this.taskStatus = taskStatus;
        this.startDate = startDate;
        this.endDate = endDate;
        this.managerId = managerId;
        this.projectId = projectId;
    }

    public WbsDTO(int projectId) {
        this.projectId = projectId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWbsNo() {
        return wbsNo;
    }

    public void setWbsNo(int wbsNo) {
        this.wbsNo = wbsNo;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    @Override
    public String toString() {
        return "WbsDTO{" +
                "id=" + id +
                ", wbsNo=" + wbsNo +
                ", content='" + content + '\'' +
                ", taskStatus='" + taskStatus + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", managerId=" + managerId +
                ", projectId=" + projectId +
                '}';
    }
}
