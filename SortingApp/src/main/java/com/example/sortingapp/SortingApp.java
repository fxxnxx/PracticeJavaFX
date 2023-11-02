package com.example.sortingapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SortingApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sorting_app.fxml"));
        primaryStage.setTitle("Sorting Application");
        primaryStage.setScene(new Scene(root, 800, 600)); // Задайте размер окна по вашим требованиям
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
