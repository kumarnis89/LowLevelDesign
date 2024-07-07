package DesignPattern.Strategy;

import java.util.List;

public class BubbleSortStrategy implements SortingStrategy{

    @Override
    public <T> void sort(List<T> items) {
        // Implement bubble sort algorithm
        int n = items.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (((Comparable<T>) items.get(j)).compareTo(items.get(j + 1)) > 0) {
                    // Swap items[j] and items[j+1]
                    T temp = items.get(j);
                    items.set(j, items.get(j + 1));
                    items.set(j + 1, temp);
                }
            }
        }
    }
}
