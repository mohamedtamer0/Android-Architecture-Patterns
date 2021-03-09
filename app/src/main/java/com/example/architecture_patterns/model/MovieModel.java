package com.example.architecture_patterns.model;

public class MovieModel {
    String name;
    String date;
    String desc;
    int id;

    public MovieModel(String name, String date, String desc, int id) {
        this.name = name;
        this.date = date;
        this.desc = desc;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

