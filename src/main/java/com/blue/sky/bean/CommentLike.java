package com.blue.sky.bean;

public class CommentLike {
    private int id;
    private int uid;
    private int cid;

    public CommentLike() {
    }

    public CommentLike(int id, int uid, int cid) {
        this.id = id;
        this.uid = uid;
        this.cid = cid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "CommentLike{" +
                "id=" + id +
                ", uid=" + uid +
                ", cid=" + cid +
                '}';
    }
}
