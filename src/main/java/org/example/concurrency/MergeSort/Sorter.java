package org.example.concurrency.MergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {

    private final List<Integer> arrayToSort;
    private final ExecutorService executorService;

    public Sorter(List<Integer> arrayToSort, ExecutorService executorService) {
        this.arrayToSort = arrayToSort;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {
        // Base case
        if (arrayToSort.size() <= 1) {
            return arrayToSort;
        }

        // 1. Divide the array
        int mid = arrayToSort.size() / 2;

        List<Integer> leftHalf = new ArrayList<>(arrayToSort.subList(0, mid));
        List<Integer> rightHalf = new ArrayList<>(arrayToSort.subList(mid, arrayToSort.size()));

        // 2. Create tasks for each half
        Sorter leftSorter = new Sorter(leftHalf, executorService);
        Sorter rightSorter = new Sorter(rightHalf, executorService);

        // 3. Submit tasks to the executor service
        Future<List<Integer>> leftFuture = executorService.submit(leftSorter);
        Future<List<Integer>> rightFuture = executorService.submit(rightSorter);

        // 4. Wait for results and merge the two sorted arrays
        List<Integer> sortedLeft = leftFuture.get(); // Blocks until left half is sorted
        List<Integer> sortedRight = rightFuture.get(); // Blocks until right half is sorted

        return merge(sortedLeft, sortedRight);
    }

    private List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> merged = new ArrayList<>();
        int i=0, j=0;
        while(i < left.size() && j < right.size()) {
            if(left.get(i) <= right.get(j)) {
                merged.add(left.get(i));
                i++;
            } else {
                merged.add(right.get(j));
                j++;
            }
        }

        while(i < left.size()) merged.add(left.get(i++));
        while(j < right.size()) merged.add(right.get(j++));

        return merged;
    }
}
