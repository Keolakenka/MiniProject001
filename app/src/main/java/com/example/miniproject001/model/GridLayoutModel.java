package com.example.miniproject001.model;

public class GridLayoutModel {
    private int image;

    public GridLayoutModel(int image, String title, String caption) {
        this.image = image;
        this.title = title;
        this.caption = caption;
    }

    private String title;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    private String caption;

}
