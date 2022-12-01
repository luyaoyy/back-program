package com.blue.sky.bean;

public class User {
    private int uid;
    private String uname;
    private String upassword;
    private String ugender;
    private int uage;
    private String uphone;
    private String uemail;
    private String uadress;
    private int ubanlance;
    private String uregisterTime;
    private String uheader;
    public User(){}

    public User(int uid, String uname, String upassword, String ugender, int uage, String uphone, String uemail, String uadress, int ubanlance, String uregisterTime, String uheader) {
        this.uid = uid;
        this.uname = uname;
        this.upassword = upassword;
        this.ugender = ugender;
        this.uage = uage;
        this.uphone = uphone;
        this.uemail = uemail;
        this.uadress = uadress;
        this.ubanlance = ubanlance;
        this.uregisterTime = uregisterTime;
        this.uheader = uheader;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    public String getUgender() {
        return ugender;
    }

    public void setUgender(String ugender) {
        this.ugender = ugender;
    }

    public int getUage() {
        return uage;
    }

    public void setUage(int uage) {
        this.uage = uage;
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public String getUadress() {
        return uadress;
    }

    public void setUadress(String uadress) {
        this.uadress = uadress;
    }

    public int getUbanlance() {
        return ubanlance;
    }

    public void setUbanlance(int ubanlance) {
        this.ubanlance = ubanlance;
    }

    public String getUregisterTime() {
        return uregisterTime;
    }

    public void setUregisterTime(String uregisterTime) {
        this.uregisterTime = uregisterTime;
    }

    public String getUheader() {
        return uheader;
    }

    public void setUheader(String uheader) {
        this.uheader = uheader;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upassword='" + upassword + '\'' +
                ", ugender='" + ugender + '\'' +
                ", uage=" + uage +
                ", uphone='" + uphone + '\'' +
                ", uemail='" + uemail + '\'' +
                ", uadress='" + uadress + '\'' +
                ", ubanlance=" + ubanlance +
                ", uregisterTime='" + uregisterTime + '\'' +
                ", uheader='" + uheader + '\'' +
                '}';
    }
}
