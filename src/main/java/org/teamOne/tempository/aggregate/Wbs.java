package org.teamOne.tempository.aggregate;

import java.util.Date;

public class Wbs {

    private int id;
    private int wbsNo;
    private String content;
    private String taskStatus;
    private Date startDate;
    private Date endDate;
    private int managerId;
    private int projectId;

    public Wbs() {
    }

    public Wbs(int id, int wbsNo, String content, String taskStatus, Date startDate, Date endDate, int managerId, int projectId) {
        this.id = id;
        this.wbsNo = wbsNo;
        this.content = content;
        this.taskStatus = taskStatus;
        this.startDate = startDate;
        this.endDate = endDate;
        this.managerId = managerId;
        this.projectId = projectId;
    }

    public Wbs(int projectId) {
        this.projectId = projectId;
    }

    public int getId() {
        return id;
    }

    public int getWbsNo() {
        return wbsNo;
    }

    public String getContent() {
        return content;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int getManagerId() {
        return managerId;
    }

    public int getProjectId() {
        return projectId;
    }

    @Override
    public String toString() {
        return "Wbs{" +
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
