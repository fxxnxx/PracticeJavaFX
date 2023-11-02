package com.example.true_shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


public class Gateway extends Shape{
    double length;
    double width;

    public Gateway(Color color, double length, double width) {
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
        gr.fillRect(10,10,500,500);
        gr.setLineDashes(0);

        gr.strokeLine(100, 50, 50, 100);
        gr.strokeLine(100, 50, 150, 100);
        gr.strokeLine(150, 100, 100, 150);
        gr.strokeLine(50, 100, 100, 150);


    }
}
