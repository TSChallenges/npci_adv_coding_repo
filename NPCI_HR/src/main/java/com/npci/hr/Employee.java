package com.npci.hr;

import java.util.Date;

public class Employee {

    private int id;
    private String name;
    private Date createdDate;

    public Employee(Date date){
        this.createdDate = date;
        System.out.println("Employee Object Created...........");
    }

    public Employee(int id, String name,Date date) {
        this.id = id;
        this.name = name;
        this.createdDate = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
