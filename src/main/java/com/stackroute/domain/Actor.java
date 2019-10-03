package com.stackroute.domain;

import org.springframework.stereotype.Component;

public class Actor {
    private String name;
    private String gender;
    private int age;

    public Actor(){}

    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }



    public void getInfo(){
        System.out.println("You are in Actor");
    }
    



}
