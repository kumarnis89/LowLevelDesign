package DesignPattern.Strategy;

import java.util.List;

public interface SortingStrategy {
    <T> void sort(List<T> items);
}
