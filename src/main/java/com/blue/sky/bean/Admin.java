package com.blue.sky.bean;

public class Admin {
    private int aid;
    private String aname;
    private String apassword;
    private String agender;
    private String aage;
    private String aphone;
    private String aemail;
    private String aheader;
    private String aadress;

    public Admin() {
    }

    public Admin(int aid, String aname, String apassword, String agender, String aage, String aphone, String aemail, String aheader, String aadress) {
        this.aid = aid;
        this.aname = aname;
        this.apassword = apassword;
        this.agender = agender;
        this.aage = aage;
        this.aphone = aphone;
        this.aemail = aemail;
        this.aheader = aheader;
        this.aadress = aadress;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getApassword() {
        return apassword;
    }

    public void setApassword(String apassword) {
        this.apassword = apassword;
    }

    public String getAgender() {
        return agender;
    }

    public void setAgender(String agender) {
        this.agender = agender;
    }

    public String getAage() {
        return aage;
    }

    public void setAage(String aage) {
        this.aage = aage;
    }

    public String getAphone() {
        return aphone;
    }

    public void setAphone(String aphone) {
        this.aphone = aphone;
    }

    public String getAemail() {
        return aemail;
    }

    public void setAemail(String aemail) {
        this.aemail = aemail;
    }

    public String getAheader() {
        return aheader;
    }

    public void setAheader(String aheader) {
        this.aheader = aheader;
    }

    public String getAadress() {
        return aadress;
    }

    public void setAadress(String aadress) {
        this.aadress = aadress;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", apassword='" + apassword + '\'' +
                ", agender='" + agender + '\'' +
                ", aage='" + aage + '\'' +
                ", aphone='" + aphone + '\'' +
                ", aemail='" + aemail + '\'' +
                ", aheader='" + aheader + '\'' +
                ", aadress='" + aadress + '\'' +
                '}';
    }
}
