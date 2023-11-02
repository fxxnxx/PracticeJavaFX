package com.example.sortingapp;

public class SelectionSort implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Найдем индекс минимального элемента в оставшейся части массива
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Обмен минимального элемента с текущим элементом
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}

