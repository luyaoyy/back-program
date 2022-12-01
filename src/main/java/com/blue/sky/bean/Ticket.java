package com.blue.sky.bean;

public class Ticket {
    private int tid;
    private int useid;
    private User user;
    private Movie movie;
    private String number;
    private int seat;
    private int movid;
    private int sessionid;
    private Session session;
    private String buyTime;
    private int tprice;
    private int status;

    public Ticket() {
    }

    public Ticket(int tid, int useid, User user, Movie movie, String number, int seat, int movid, int sessionid, Session session, String buyTime, int tprice, int status) {
        this.tid = tid;
        this.useid = useid;
        this.user = user;
        this.movie = movie;
        this.number = number;
        this.seat = seat;
        this.movid = movid;
        this.sessionid = sessionid;
        this.session = session;
        this.buyTime = buyTime;
        this.tprice = tprice;
        this.status = status;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public int getTprice() {
        return tprice;
    }

    public void setTprice(int tprice) {
        this.tprice = tprice;
    }

    public int getStatus() {
        return status;
    }

    public int getUseid() {
        return useid;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public void setUseid(int useid) {
        this.useid = useid;
    }

    public int getMovid() {
        return movid;
    }

    public void setMovid(int movid) {
        this.movid = movid;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(String buyTime) {
        this.buyTime = buyTime;
    }

    public int getSessionid() {
        return sessionid;
    }

    public void setSessionid(int sessionid) {
        this.sessionid = sessionid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "tid=" + tid +
                ", useid=" + useid +
                ", user=" + user +
                ", movie=" + movie +
                ", number='" + number + '\'' +
                ", seat=" + seat +
                ", movid=" + movid +
                ", sessionid=" + sessionid +
                ", session=" + session +
                ", buyTime='" + buyTime + '\'' +
                ", tprice=" + tprice +
                ", status=" + status +
                '}';
    }
}
