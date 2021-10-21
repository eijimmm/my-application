package com.example.myapplication.Model;

public class Users {
    private String email, name, phone, pwd;

    public Users(){

    }

    public Users(String email, String name, String phone, String pwd) {
        this.email = email;
        this.name = name;
        this.phone = phone;
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
