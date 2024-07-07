package DesignPattern.Strategy;

import java.util.Arrays;
import java.util.List;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        List<Integer> items = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5);

        // Use BubbleSortStrategy
        SortContext context = new SortContext(new BubbleSortStrategy());
        context.sort(items);
        System.out.println("Bubble sorted: " + items);

         // Use QuickSortStrategy
        items = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5);
        context.setStrategy(new QuickSortStrategy());
        context.sort(items);
        System.out.println("Quick sorted: " + items);

        // Use MergeSortStrategy
        items = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5);
        context.setStrategy(new MergeSortStrategy());
        context.sort(items);
        System.out.println("Merge sorted: " + items);
    }
}
