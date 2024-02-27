package org.teamOne.tempository.dto;

public class DefinitionOfTableDTO {
    private int id;
    private int projectId;

    public DefinitionOfTableDTO() {
    }

    public DefinitionOfTableDTO(int projectId) {
        this.projectId = projectId;
    }

    public DefinitionOfTableDTO(int id, int projectId) {
        this.id = id;
        this.projectId = projectId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    @Override
    public String toString() {
        return "DefinitionOfTableDTO{" +
                "id=" + id +
                ", projectId=" + projectId +
                '}';
    }
}
