package org.teamOne.tempository.aggregate;

public class ProjectTestcase {
    private int id;
    private int testNo;
    private String separate;
    private String content;
    private String expectedValue;
    private String result;
    private String note;
    private int projectId;

    public ProjectTestcase() {
    }

    public ProjectTestcase(int projectId) {
        this.projectId = projectId;
    }


    public ProjectTestcase(int id, int testNo, String separate, String content, String expectedValue, String result, String note, int projectId) {
        this.id = id;
        this.testNo = testNo;
        this.separate = separate;
        this.content = content;
        this.expectedValue = expectedValue;
        this.result = result;
        this.note = note;
        this.projectId = projectId;
    }

    public int getId() {
        return id;
    }

    public int getTestNo() {
        return testNo;
    }

    public String getSeparate() {
        return separate;
    }

    public String getContent() {
        return content;
    }

    public String getExpectedValue() {
        return expectedValue;
    }

    public String getResult() {
        return result;
    }

    public String getNote() {
        return note;
    }

    public int getProjectId() {
        return projectId;
    }

    @Override
    public String toString() {
        return "ProjectTestcase{" +
                "id=" + id +
                ", testNo=" + testNo +
                ", separate='" + separate + '\'' +
                ", content='" + content + '\'' +
                ", expectedValue='" + expectedValue + '\'' +
                ", result='" + result + '\'' +
                ", note='" + note + '\'' +
                ", projectId=" + projectId +
                '}';
    }
}
