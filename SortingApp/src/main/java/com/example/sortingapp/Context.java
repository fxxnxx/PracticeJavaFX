package com.example.sortingapp;

public class Context {
    private SortingStrategy strategy;

    public Context(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void sortArray(int[] array) {
        strategy.sort(array);
    }
}
