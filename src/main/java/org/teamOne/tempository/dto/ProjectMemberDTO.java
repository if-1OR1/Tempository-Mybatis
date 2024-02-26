package org.teamOne.tempository.dto;

public class ProjectMemberDTO {
    private int memberId;
    private int projectId;

    public ProjectMemberDTO() {
    }

    public ProjectMemberDTO(int memberId, int projectId) {
        this.memberId = memberId;
        this.projectId = projectId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    @Override
    public String toString() {
        return "ProjectMemberDTO{" +
                "memberId=" + memberId +
                ", projectId=" + projectId +
                '}';
    }
}
