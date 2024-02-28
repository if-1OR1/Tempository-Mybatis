package org.teamOne.tempository.dto;

public class ProjectDTO {
    private int id;

    public ProjectDTO() {
    }

    public ProjectDTO(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ProjectDTO{" +
                "id=" + id +
                '}';
    }
}
