package com.test.provider;

import com.test.entity.Shape;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void addShape(Shape shape) {
        shapeMap.put(shape.getId(), shape);
    }

    public static void updateShape(Shape shape){
        shapeMap.replace(shape.getId(),shape);
    }

    private static void loadCache(){
        //empty for now
    }
}