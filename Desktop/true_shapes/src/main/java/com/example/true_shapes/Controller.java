package com.example.true_shapes;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class Controller {
    @FXML
    private Label welcomeText, label_1;

    private GraphicsContext gc;
    @FXML
    private Canvas canvas;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }



    public void onSMS(ActionEvent actionEvent) {
        gc = canvas.getGraphicsContext2D();
        SMS sms_shape = new SMS(Color.GREEN, 10, 20);
        sms_shape.draw(gc);
        label_1.setAlignment(Pos.CENTER);
        label_1.setText("Поток сообщений");
    }
    public void onTask(ActionEvent actionEvent) {
        gc = canvas.getGraphicsContext2D();
        Task task = new Task(Color.GREEN, 10, 20);
        task.draw(gc);
        label_1.setAlignment(Pos.CENTER);
        label_1.setText("Задача");
    }

    public void onSHL(ActionEvent actionEvent) {
        gc = canvas.getGraphicsContext2D();
        Gateway shl = new Gateway(Color.GREEN, 10, 20);
        shl.draw(gc);

        label_1.setAlignment(Pos.CENTER);
        label_1.setText("Шлюз");
    }

    public void onEvent(ActionEvent actionEvent) {
        gc = canvas.getGraphicsContext2D();
        Event event = new Event(Color.GREEN, 10, 20);
        event.draw(gc);
        label_1.setAlignment(Pos.CENTER);
        label_1.setText("Событие");
    }

       public void onDtobj(ActionEvent actionEvent) {
        gc = canvas.getGraphicsContext2D();
        DataObject obj = new DataObject(Color.GREEN, 10, 20);
        obj.draw(gc);
        label_1.setAlignment(Pos.CENTER);
        label_1.setText("Управление");
    }

}