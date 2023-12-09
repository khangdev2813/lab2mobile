package com.example.grid;

public enum Thumbnail {
    Thumbnail1("Thumbnail 1", R.drawable.images),
    Thumbnail2("Thumbnail 2", R.drawable.img2),
    Thumbnail3("Thumbnail 3", R.drawable.img3),
    Thumbnail4("Thumbnail 4", R.drawable.img4);
    private String name;
    private int img;
    Thumbnail(String name , int img) {
        this.name = name;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public int getImg() {
        return img;
    }
}
