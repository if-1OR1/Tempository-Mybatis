package org.teamOne.tempository.aggregate;

public class Requirement {
    private int id;
    private Integer requirementNo;
    private String name;
    private String separate;
    private String content;
    private String note;
    private int projectId;

    public Requirement() {
    }

    public Requirement(int id, Integer requirement_no, String name, String separate, String content, String note, int projectId) {
        this.id = id;
        this.requirementNo = requirement_no;
        this.name = name;
        this.separate = separate;
        this.content = content;
        this.note = note;
        this.projectId = projectId;
    }

    public Requirement(int projectId) {
        this.projectId = projectId;
    }

    public int getId() {
        return id;
    }


    public Integer getRequirementNo() {
        return requirementNo;
    }


    public String getName() {
        return name;
    }

    public String getSeparate() {
        return separate;
    }


    public String getContent() {
        return content;
    }


    public String getNote() {
        return note;
    }


    @Override
    public String toString() {
        return "Requirement{" +
                "id=" + id +
                ", requirement_no=" + requirementNo +
                ", name='" + name + '\'' +
                ", separate='" + separate + '\'' +
                ", content='" + content + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}

