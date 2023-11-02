package com.example.sortingapp;

public interface SortingStrategy {
    void sort(int[] numbers);
    default boolean compare(int a, int b) {
        return a < b;
    }
}
