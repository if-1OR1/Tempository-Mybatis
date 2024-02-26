package org.teamOne.tempository.aggregate;

public class ProjectMember {
    private int memberId;
    private int projectId;
    private String position;
    private String memberStatus;

    public ProjectMember() {
    }

    public ProjectMember(int memberId, int projectId) {
        this.memberId = memberId;
        this.projectId = projectId;
    }

    public ProjectMember(int memberId, int projectId, String position, String memberInviteStatus) {
        this.memberId = memberId;
        this.projectId = projectId;
        this.position = position;
        this.memberStatus = memberInviteStatus;
    }

    public int getMemberId() {
        return memberId;
    }

    public int getProjectId() {
        return projectId;
    }

    public String getPosition() {
        return position;
    }

    public String getMemberStatus() {
        return memberStatus;
    }

    @Override
    public String toString() {
        return "ProjectMember{" +
                "memberId=" + memberId +
                ", projectId=" + projectId +
                ", position='" + position + '\'' +
                ", memberInviteStatus='" + memberStatus + '\'' +
                '}';
    }
}
