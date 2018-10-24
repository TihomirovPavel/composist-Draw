package com.test.entity;

public class Rectangle extends Shape {
    private int width, height;

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    void draw() {

    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
