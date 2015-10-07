package com.swapnil.sort.algo;

import com.swapnil.sort.util.SortUtil;

/**
 * Created by swapn on 30-09-2015.
 */
public class HeapSort extends Sortable {

    private static int N;

    public static void main(String[] args) {
        Sortable sortable = new MergeSort();
        int[] input = {2, 0, 0, 2, 1, 4, 7, 0, 0, 4};

        System.out.println("\nBefore Sort : ");
        SortUtil.display(input);

        sortable.sort(input);

        System.out.println("\nAfter Sort : ");
        SortUtil.display(input);
    }

    @Override
    public void sort(int[] inputArray) {
        super.sort(inputArray);

        createHeap();

        for (int i = N; i > 0; i--) {
            SortUtil.swap(0, i, inputArray);
            N = N - 1;
            adjustHeap(0);
        }
    }

    private void createHeap() {
        N = length - 1;
        for (int i = N / 2; i >= 0; i--)
            adjustHeap(i);
    }

    private void adjustHeap(int index) {

        int left = 2 * index;
        int right = 2 * index + 1;
        int max = index;

        if (left <= length - 1 && inputArray[left] > inputArray[index])
            max = left;

        if (right <= length - 1 && inputArray[right] > inputArray[max])
            max = right;

        if (max != index) {
            SortUtil.swap(index, max, inputArray);
            adjustHeap(max);
        }
    }

}
