package DesignPattern.Strategy;

import java.util.List;

public class SortContext {
    private SortingStrategy sortingStrategy;

    public SortContext(SortingStrategy sortingStrategy){
        this.sortingStrategy = sortingStrategy;
    }

    // Method to set the strategy at runtime
    public void setStrategy(SortingStrategy strategy) {
        this.sortingStrategy = strategy;
    }

    // Method to sort items using the selected strategy
    public <T> void sort(List<T> items) {
        sortingStrategy.sort(items);
    }
}
