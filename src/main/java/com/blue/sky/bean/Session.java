package com.blue.sky.bean;

public class Session {
    private int sid;
    private Movie movie;
    private int mid;
    private String manager;
    private String begTime;
    private String room;
    private int status;
    public Session(){};

    public Session(int sid, Movie movie, int mid, String manager, String begTime, String room, int status) {
        this.sid = sid;
        this.movie = movie;
        this.mid = mid;
        this.manager = manager;
        this.begTime = begTime;
        this.room = room;
        this.status = status;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }


    public String getBegTime() {
        return begTime;
    }

    public void setBegTime(String begTime) {
        this.begTime = begTime;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Session{" +
                "sid=" + sid +
                ", movie=" + movie +
                ", mid=" + mid +
                ", manager='" + manager + '\'' +
                ", begTime='" + begTime + '\'' +
                ", room='" + room + '\'' +
                ", status=" + status +
                '}';
    }
}
