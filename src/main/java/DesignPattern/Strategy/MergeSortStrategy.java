package DesignPattern.Strategy;

import java.util.ArrayList;
import java.util.List;

public class MergeSortStrategy implements SortingStrategy{
    @Override
    public <T> void sort(List<T> items) {
        mergeSort(items, 0, items.size() - 1);
    }

    private <T> void mergeSort(List<T> items, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(items, left, middle);
            mergeSort(items, middle + 1, right);
            merge(items, left, middle, right);
        }
    }

    private <T> void merge(List<T> items, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        List<T> leftList = new ArrayList<>(n1);
        List<T> rightList = new ArrayList<>(n2);

        for (int i = 0; i < n1; i++) {
            leftList.add(items.get(left + i));
        }
        for (int j = 0; j < n2; j++) {
            rightList.add(items.get(middle + 1 + j));
        }

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (((Comparable<T>) leftList.get(i)).compareTo(rightList.get(j)) <= 0) {
                items.set(k, leftList.get(i));
                i++;
            } else {
                items.set(k, rightList.get(j));
                j++;
            }
            k++;
        }

        while (i < n1) {
            items.set(k, leftList.get(i));
            i++;
            k++;
        }

        while (j < n2) {
            items.set(k, rightList.get(j));
            j++;
            k++;
        }
    }
}
