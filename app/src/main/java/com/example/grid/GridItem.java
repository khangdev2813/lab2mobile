package com.example.grid;

public class GridItem {
    String text;
    int image;
    boolean promotion;

    public GridItem(String text, int image, boolean promotion) {
        this.text = text;
        this.image = image;
        this.promotion = promotion;
    }

    public String getText() {
        return text;
    }

    public int getImage() {
        return image;
    }

    public boolean isPromotion() {
        return promotion;
    }
}
