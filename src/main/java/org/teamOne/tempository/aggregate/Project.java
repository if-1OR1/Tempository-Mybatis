package org.teamOne.tempository.aggregate;

public class Project {
    private int id;
    private String name;
    private boolean isPublic;
    private int likeCnt;
    private String status;
    private String content;

    public Project(int id, String name, boolean isPublic, int likeCnt, String status, String content) {
        this.id = id;
        this.name = name;
        this.isPublic = isPublic;
        this.likeCnt = likeCnt;
        this.status = status;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public int getLikeCnt() {
        return likeCnt;
    }

    public String getStatus() {
        return status;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isPublic=" + isPublic +
                ", likeCnt=" + likeCnt +
                ", status='" + status + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public Project(int id) {
        this.id = id;
    }

    public Project() {
    }
}
