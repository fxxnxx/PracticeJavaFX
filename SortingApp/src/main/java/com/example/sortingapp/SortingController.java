package com.example.sortingapp;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SortingController {

    @FXML
    private TextField inputField; // Предполагается, что у вас есть поле ввода в вашем интерфейсе
    @FXML
    private Button sortButton; // Предполагается, что у вас есть кнопка сортировки в вашем интерфейсе
    // Определите другие элементы управления, как это необходимо

    private Context context; // Определите объект Context

    @FXML
    public void initialize() {
        // Инициализируйте объект Context с использованием стандартной стратегии сортировки или другой настройки, которая вам нужна
        context = new Context(new BubbleSort()); // Вы можете выбрать стратегию сортировки по умолчанию здесь
    }

    @FXML
    private void bubbleSort(ActionEvent event) {
        int[] array = // Получите массив из inputField или других элементов управления в вашем интерфейсе
                context.sortArray(array);
        // Обновите ваш интерфейс отсортированным массивом
    }

    @FXML
    private void selectionSort(ActionEvent event) {
        int[] array = // Получите массив из inputField или других элементов управления в вашем интерфейсе
                context.sortArray(array);
        // Обновите ваш интерфейс отсортированным массивом
    }

    // Другие методы обработки событий для разных стратегий
}
