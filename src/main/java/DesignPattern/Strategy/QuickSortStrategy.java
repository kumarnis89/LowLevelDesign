package DesignPattern.Strategy;

import java.util.List;

public class QuickSortStrategy implements SortingStrategy{

    @Override
    public <T> void sort(List<T> items) {
        quicksort(items, 0, items.size()-1);
    }

    private <T> void quicksort(List<T> items, int low, int high){
        if(low<high){
            int pi = partition(items,low,high);
            quicksort(items,low,pi-1);
            quicksort(items,pi+1,high);
        }
    }

    private <T> int partition(List<T> items, int low, int high){
        T pivot = items.get(high);
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (((Comparable<T>) items.get(j)).compareTo(pivot) < 0) {
                i++;
                T temp = items.get(i);
                items.set(i, items.get(j));
                items.set(j, temp);
            }
        }
        T temp = items.get(i + 1);
        items.set(i + 1, items.get(high));
        items.set(high, temp);
        return i + 1;
    }
}
