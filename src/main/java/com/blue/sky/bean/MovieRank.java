package com.blue.sky.bean;

public class MovieRank {
    private int mid;
    private Movie movie;
    private String mname;
    private int total;
    private String mimg;

    public MovieRank() {
    }

    public MovieRank(int mid, Movie movie, String mname, int total, String mimg) {
        this.mid = mid;
        this.movie = movie;
        this.mname = mname;
        this.total = total;
        this.mimg = mimg;
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

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getMimg() {
        return mimg;
    }

    public void setMimg(String mimg) {
        this.mimg = mimg;
    }

    @Override
    public String toString() {
        return "MovieRank{" +
                "mid=" + mid +
                ", movie=" + movie +
                ", mname='" + mname + '\'' +
                ", total=" + total +
                ", mimg='" + mimg + '\'' +
                '}';
    }
}
