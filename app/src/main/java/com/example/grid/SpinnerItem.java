package com.example.grid;

public class SpinnerItem {
    private String text;
    private  int image;

    public SpinnerItem(String text, int image) {
        this.text = text;
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public int getImage() {
        return image;
    }
}
