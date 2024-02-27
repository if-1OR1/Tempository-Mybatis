package org.teamOne.tempository.dto;

public class RequirementDTO {
    private int id;
    private int project_id;

    public RequirementDTO(int id, int project_id) {
        this.id = id;
        this.project_id = project_id;
    }

    public RequirementDTO(int project_id) {
        this.project_id = project_id;
    }

    public RequirementDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    @Override
    public String toString() {
        return "RequirementDTO{" +
                "id=" + id +
                ", project_id=" + project_id +
                '}';
    }
}
