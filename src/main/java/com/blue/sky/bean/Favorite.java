package com.blue.sky.bean;

public class Favorite {
    private int id;
    private int uid;
    private int mid;
    private User user;
    private Movie movie;

    public Favorite() {
    }

    public Favorite(int id, int uid, int mid, User user, Movie movie) {
        this.id = id;
        this.uid = uid;
        this.mid = mid;
        this.user = user;
        this.movie = movie;
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

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "Favorite{" +
                "id=" + id +
                ", uid=" + uid +
                ", mid=" + mid +
                ", user=" + user +
                ", movie=" + movie +
                '}';
    }
}
