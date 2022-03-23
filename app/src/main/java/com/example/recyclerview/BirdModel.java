package com.example.recyclerview;

public class BirdModel {
    String birdName;
    int image;

    public BirdModel(String birdName, int image) {
        this.birdName = birdName;
        this.image = image;
    }

    public String getBirdName() {
        return birdName;
    }

    public int getImage() {
        return image;
    }
}
