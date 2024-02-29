package org.teamOne.tempository.dto;

public class IssueDTO {
    private int Id;
    private int issueNo;
    private String issueName;
    private String issueStatus;
    private String issueContent;
    private int managerId;
    private int writerId;
    private int projectId;

    public IssueDTO() {
    }

    public IssueDTO(int projectId) {
        this.projectId = projectId;
    }

    public IssueDTO(int id, int issueNo, String issueName, String issueStatus, String issueContent, int managerId, int writerId, int projectId) {
        Id = id;
        this.issueNo = issueNo;
        this.issueName = issueName;
        this.issueStatus = issueStatus;
        this.issueContent = issueContent;
        this.managerId = managerId;
        this.writerId = writerId;
        this.projectId = projectId;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getIssueNo() {
        return issueNo;
    }

    public void setIssueNo(int issueNo) {
        this.issueNo = issueNo;
    }

    public String getIssueName() {
        return issueName;
    }

    public void setIssueName(String issueName) {
        this.issueName = issueName;
    }

    public String getIssueStatus() {
        return issueStatus;
    }

    public void setIssueStatus(String issueStatus) {
        this.issueStatus = issueStatus;
    }

    public String getIssueContent() {
        return issueContent;
    }

    public void setIssueContent(String issueContent) {
        this.issueContent = issueContent;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public int getWriterId() {
        return writerId;
    }

    public void setWriterId(int writerId) {
        this.writerId = writerId;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    @Override
    public String toString() {
        return "IssueDTO{" +
                "Id=" + Id +
                ", issueNo=" + issueNo +
                ", issueName='" + issueName + '\'' +
                ", issueStatus='" + issueStatus + '\'' +
                ", issueContent='" + issueContent + '\'' +
                ", managerId=" + managerId +
                ", writerId=" + writerId +
                ", projectId=" + projectId +
                '}';
    }
}
