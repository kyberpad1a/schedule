package com.example.rspisaniempt.Model;

public class PersonModel {
    private String day;
    private String where;
    private String number;
    private String name;

    public PersonModel(String day, String where, String number, String name) {
        this.day = day;
        this.where = where;
        this.number = number;
        this.name = name;
    }

    public PersonModel() {
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
