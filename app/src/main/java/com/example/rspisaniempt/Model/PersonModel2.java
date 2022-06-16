package com.example.rspisaniempt.Model;

public class PersonModel2 {
    private String day;
    private String where;
    private String number;
    private String name;
    private String name2;

    public PersonModel2(String day, String where, String number, String name, String name2) {
        this.day = day;
        this.where = where;
        this.number = number;
        this.name = name;
        this.name2 = name2;
    }

    public PersonModel2() {
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

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }
}
