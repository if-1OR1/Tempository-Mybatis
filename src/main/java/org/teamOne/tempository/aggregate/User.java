package org.teamOne.tempository.aggregate;

public class User {
    private int id;
    private String name;
    private String nickname;
    private String provider;
    private String accessLevel;
    private String userStatus;
    private int followerCnt;
    private int followingCnt;
    private int grade;
    private String email;
    private String password;
    private String snsId;

    public User() {
    }

    public User(String name, String nickname, int followerCnt, int followingCnt, int grade, String email) {
        this.name = name;
        this.nickname = nickname;
        this.followerCnt = followerCnt;
        this.followingCnt = followingCnt;
        this.grade = grade;
        this.email = email;
    }

    public User(int id, String name, String nickname, String provider, String accessLevel, String userStatus, int followerCnt, int followingCnt, int grade, String email, String password, String snsId) {
        this.id = id;
        this.name = name;
        this.nickname = nickname;
        this.provider = provider;
        this.accessLevel = accessLevel;
        this.userStatus = userStatus;
        this.followerCnt = followerCnt;
        this.followingCnt = followingCnt;
        this.grade = grade;
        this.email = email;
        this.password = password;
        this.snsId = snsId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public String getProvider() {
        return provider;
    }

    public String getAccessLevel() {
        return accessLevel;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public int getFollowerCnt() {
        return followerCnt;
    }

    public int getFollowingCnt() {
        return followingCnt;
    }

    public int getGrade() {
        return grade;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getSnsId() {
        return snsId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", provider='" + provider + '\'' +
                ", accessLevel='" + accessLevel + '\'' +
                ", userStatus='" + userStatus + '\'' +
                ", followerCnt=" + followerCnt +
                ", followingCnt=" + followingCnt +
                ", grade=" + grade +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", snsId='" + snsId + '\'' +
                '}';
    }
}
