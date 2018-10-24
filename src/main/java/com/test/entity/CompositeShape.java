package com.test.entity;

import java.util.List;

public class CompositeShape extends Shape {
    private List<Shape> childShapes;

    public CompositeShape( List<Shape> childShapes) {
        this.type = "CompositeShape";
        this.childShapes = childShapes;
    }

    public void addShape (Shape shape){
        childShapes.add(shape);
    }

    public void removeShape (Shape shape){
        childShapes.remove(shape);
    }

    public List<Shape> getChildShapes() {
        return childShapes;
    }

    @Override
    void draw() {

    }

    @Override
    public void move(int x, int y) {
        super.move(x, y);
        for (Shape shape : childShapes) {
            shape.move(x,y);
        }
    }
}
