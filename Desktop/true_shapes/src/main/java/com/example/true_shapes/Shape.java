package com.example.true_shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

abstract class Shape {
    //параметры фигуры - приватные поля
    Color color;
    // объявление абстрактных методов
    abstract double area();
    public abstract String toString();
    abstract void draw(GraphicsContext gr);
    // конструктор
    public Shape(Color color) {
        System.out.println("Shape constructor called");
        this.color = color;
        //this.color = Color.valueOf(color);
        }
    // реализация методов
    public void setColor(Color color) {
        this.color=color; }
}
