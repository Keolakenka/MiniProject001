package com.example.miniproject001.model;

public class ModelUser {
    String name;
    String gender;
    String career;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ModelUser(String name, String gender, String career) {
        this.name = name;
        this.gender = gender;
        this.career = career;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }
}
