package com.example.sortingapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SortingController {
    @FXML
    private TextField inputArrayField;

    @FXML
    private Button bubbleSortButton;

    @FXML
    private Button selectionSortButton;

    @FXML
    private Button insertionSortButton;

    @FXML
    private Label resultLabel;

    private int[] arrayToSort;

    public SortingController() {
        // Инициализация контроллера
    }

    @FXML
    private void initialize() {
        // Инициализация интерфейса при старте приложения
    }

    @FXML
    private void bubbleSort() {
        arrayToSort = parseInput(inputArrayField.getText());
        if (arrayToSort != null) {
            Context context = new Context(new BubbleSort());
            context.sortArray(arrayToSort);
            updateResultLabel();
        }
    }

    @FXML
    private void selectionSort() {
        arrayToSort = parseInput(inputArrayField.getText());
        if (arrayToSort != null) {
            Context context = new Context(new SelectionSort());
            context.sortArray(arrayToSort);
            updateResultLabel();
        }
    }

    @FXML
    private void insertionSort() {
        arrayToSort = parseInput(inputArrayField.getText());
        if (arrayToSort != null) {
            Context context = new Context(new InsertionSort());
            context.sortArray(arrayToSort);
            updateResultLabel();
        }
    }

    private int[] parseInput(String input) {
        String[] inputNumbers = input.split(" ");
        int[] numbers = new int[inputNumbers.length];

        for (int i = 0; i < inputNumbers.length; i++) {
            try {
                numbers[i] = Integer.parseInt(inputNumbers[i]);
            } catch (NumberFormatException e) {
                // Обработка ошибки, если введенные данные не являются целыми числами
                // Можете добавить логику для обработки некорректных входных данных
                return null;
            }
        }

        return numbers;
    }

    private void updateResultLabel() {
        if (arrayToSort != null) {
            StringBuilder result = new StringBuilder("Sorted Array: ");
            for (int num : arrayToSort) {
                result.append(num).append(" ");
            }
            resultLabel.setText(result.toString());
        } else {
            resultLabel.setText("Invalid input. Please enter integers separated by spaces.");
        }
    }
}

