package com.example.task3;

import javafx.scene.paint.Color;

public class ShapeFactory {
    public Shape createShape(int numberOfSides) {

        switch (numberOfSides) {
            case 0:
                return new Circle(100, Color.GRAY);
            case 1:
                return new Straight(100, 100, 300, 300, Color.GRAY);
            case 2:
                return new Angle(Color.GRAY);
            case 3:
                return new Triangle(100, Color.GRAY);
            case 4:
                return new Square(100, Color.GRAY);
            case 5:
                return new Pentagon(100, Color.GRAY);
            default:
                return null;
        }
    }
}
