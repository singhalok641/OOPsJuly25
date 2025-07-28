package org.example.concurrency.MergeSort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list = List.of(8, 1, 6, 2, 4, 9, 3, 7 ,5);

        ExecutorService executorService = Executors.newCachedThreadPool();
        Sorter mainSorterTask = new Sorter(list, executorService);

        // Submit the main task and get the final result
        Future<List<Integer>> sortedListFuture = executorService.submit(mainSorterTask);

        List<Integer> sortedList = sortedListFuture.get();

        System.out.println("Original List: " + list);
        System.out.println("Sorted List: " + sortedList);

        executorService.shutdown();
    }
}
