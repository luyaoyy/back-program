package com.blue.sky.bean;

public class SlideImg {
    private int id;
    private int mid;
    private Movie movie;
    private String imgUrl;
    private String createTime;

    public SlideImg() {
    }

    public SlideImg(int id, int mid, Movie movie, String imgUrl, String createTime) {
        this.id = id;
        this.mid = mid;
        this.movie = movie;
        this.imgUrl = imgUrl;
        this.createTime = createTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "SlideImg{" +
                "id=" + id +
                ", mid=" + mid +
                ", movie=" + movie +
                ", imgUrl='" + imgUrl + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
