package com.example.sortingapp;

public class InsertionSort implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            // Сравниваем текущий элемент с предыдущими элементами и перемещаем их вправо, если они больше ключа
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            // Вставляем ключ в правильную позицию
            array[j + 1] = key;
        }
    }
}

