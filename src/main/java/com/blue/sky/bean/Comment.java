package com.blue.sky.bean;

public class Comment {
    private int cid;
    private int mid;
    private int uid;
    private String grade;
    private String time;
    private String content;
    private User user;
    private boolean like;
    private int count;

    public Comment() {
    }

    public Comment(int cid, int mid, int uid, String grade, String time, String content, User user, boolean like, int count) {
        this.cid = cid;
        this.mid = mid;
        this.uid = uid;
        this.grade = grade;
        this.time = time;
        this.content = content;
        this.user = user;
        this.like = like;
        this.count = count;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean getLike() {
        return like;
    }

    public void setLike(boolean like) {
        this.like = like;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "cid=" + cid +
                ", mid=" + mid +
                ", uid=" + uid +
                ", grade='" + grade + '\'' +
                ", time='" + time + '\'' +
                ", content='" + content + '\'' +
                ", user=" + user +
                ", like=" + like +
                ", count=" + count +
                '}';
    }
}
