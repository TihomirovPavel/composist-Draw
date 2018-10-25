package com.test.model;

import org.springframework.stereotype.Service;

@Service
public class AnsweModel {
    public String createComposite(int x, int y, int width, int height) {
        return "Composite";
    }

    public String createRectangle(int x, int y, int width, int height) {
        return "Rectangle";
    }

    public String createCircle(int x, int y, int radius) {
        return "Circle";
    }
}
