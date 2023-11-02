package com.example.sortingapp;

public class BubbleSort implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Обмен элементов, если текущий больше следующего
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // Если внутренний цикл не выполнил ни одной замены, массив уже отсортирован
            if (!swapped) {
                break;
            }
        }
    }
}

