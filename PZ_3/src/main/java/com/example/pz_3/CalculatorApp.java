package com.example.pz_3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CalculatorApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Арифметический калькулятор");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);

        TextField operandAField = new TextField();
        TextField operandBField = new TextField();
        ComboBox<String> operationComboBox = new ComboBox<>();
        Label resultLabel = new Label();

        Button calculateButton = new Button("Вычислить");
        Button refreshButton = new Button("Обновить"); // Добавляем кнопку "Refresh"

        grid.add(new Label("Число A:"), 0, 0);
        grid.add(operandAField, 1, 0);
        grid.add(new Label("Число Б:"), 0, 1);
        grid.add(operandBField, 1, 1);
        grid.add(new Label("Операция:"), 0, 2);
        grid.add(operationComboBox, 1, 2);
        grid.add(calculateButton, 0, 3);
        grid.add(refreshButton, 1, 3); // Добавляем кнопку "Refresh"
        grid.add(resultLabel, 0, 4, 2, 1);

        operationComboBox.getItems().addAll(
                "Сложение", "Вычитание", "Умножение", "Деление",
                "И", "ИЛИ", "ИНЕ", "ИЛИ-НЕ", "XOR"
        );

        calculateButton.setOnAction(event -> {
            // Обработка нажатия кнопки "Calculate"
            String operation = operationComboBox.getValue();
            double operandA = Double.parseDouble(operandAField.getText());
            double operandB = Double.parseDouble(operandBField.getText());

            Calculator calculator = new Calculator();

            switch (operation) {
                case "Сложение":
                    calculator.setStrategy(new AdditionStrategy());
                    break;
                case "Вычитание":
                    calculator.setStrategy(new SubtractionStrategy());
                    break;
                case "Умножение":
                    calculator.setStrategy(new MultiplicationStrategy());
                    break;
                case "Деление":
                    calculator.setStrategy(new DivisionStrategy());
                    break;
                case "И":
                    calculator.setStrategy(new LogicalAndStrategy());
                    break;
                case "ИЛИ":
                    calculator.setStrategy(new LogicalOrStrategy());
                    break;
                case "ИНЕ":
                    calculator.setStrategy(new LogicalNotStrategy());
                    break;
                case "ИЛИ-НЕ":
                    calculator.setStrategy(new LogicalNOrStrategy());
                    break;
                case "XOR":
                    calculator.setStrategy(new LogicalXorStrategy());
                    break;
            }

            resultLabel.setText(calculator.executeOperation(operandA, operandB));
        });

        refreshButton.setOnAction(event -> {
            // Обработка нажатия кнопки "Refresh"
            operandAField.clear();
            operandBField.clear();
            operationComboBox.getSelectionModel().clearSelection();
            resultLabel.setText("");
        });

        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
