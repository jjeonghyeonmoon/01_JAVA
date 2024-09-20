package com.ohgiraffers.section02.set;

import java.awt.print.Book;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class BookDTO {


    private String num;
    private String name;
    private String maker;
    private String price;


    public BookDTO(String num, String name, String maker, String price) {
        this.num = num;
        this.name = name;
        this.maker = maker;
        this.price = price;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "num='" + num + '\'' +
                ", name='" + name + '\'' +
                ", maker='" + maker + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
