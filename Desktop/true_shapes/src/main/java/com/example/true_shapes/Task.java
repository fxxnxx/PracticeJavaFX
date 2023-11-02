package com.example.true_shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Task extends Shape{
    double length;
    double width;

    public Task(Color color, double length, double width) {
// calling Shape constructor
        super(color);
        this.length = length;
        this.width = width; }
    @Override
    double area() {
        return length*width; }
    @Override
    public String toString() {
        return "Rectangle color is " + super.color + "and area is: " + area(); }

    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill(Color.WHITE);
        gr.fillRect(10,10,450,450);
        gr.setLineDashes(0);

        gr.strokeRoundRect(50, 78, 100, 50, 10, 10);

    }
}
