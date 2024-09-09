package com.ohgiraffers.section03.dto;

public class problem1 {

    private String id;
    private int pwd;
    private String name;
    private int age;
    private char gender;
    private int number;
    private String mail;

    public void setId(String id) {
        this.id = id;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getId() {
        return id;
    }

    public int getPwd() {
        return pwd;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public int getNumber() {
        return number;
    }

    public String getMail() {
        return mail;
    }
}
