package com.example.miniproject001.model;

public class ContactModel {


    Integer image;



    public ContactModel(Integer image, String name, String call) {
        this.image = image;
        this.name = name;
        this.call = call;
    }

    String name;
    String call;

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }
}
