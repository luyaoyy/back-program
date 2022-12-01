package com.blue.sky.bean;

public class TicketOrder {
    private int amount;
    private String number;
    private Movie movie;
    private User user;
    private Session session;
    private int total;
    private int status;
    private String seat;
    private String buyTime;
    private String room;

    public TicketOrder() {
    }


    public TicketOrder(int amount, String number, Movie movie, User user, Session session, int total, int status, String seat, String buyTime, String room) {
        this.amount = amount;
        this.number = number;
        this.movie = movie;
        this.user = user;
        this.session = session;
        this.total = total;
        this.status = status;
        this.seat = seat;
        this.buyTime = buyTime;
        this.room = room;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(String buyTime) {
        this.buyTime = buyTime;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "TicketOrder{" +
                "amount=" + amount +
                ", number='" + number + '\'' +
                ", movie=" + movie +
                ", user=" + user +
                ", session=" + session +
                ", total=" + total +
                ", status=" + status +
                ", seat='" + seat + '\'' +
                ", buyTime='" + buyTime + '\'' +
                ", room='" + room + '\'' +
                '}';
    }
}
