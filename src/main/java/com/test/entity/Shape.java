package com.test.entity;

import java.util.stream.IntStream;

public abstract class Shape implements Cloneable {
    private static int counter;
    private String id;
    String type;
    private int x, y;

    abstract void draw();

    Shape(){
        id = String.valueOf(counter);
        counter++;
    }

    public void move (int x, int y){
        this.x += x;
        this.y += y;
    }

    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}