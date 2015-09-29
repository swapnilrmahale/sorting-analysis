package com.swapnil.sort.algo;

import com.swapnil.sort.util.SortUtil;

/**
 * Created by swapn on 26-09-2015.
 */
public class QuickSort extends Sortable{

    @Override
    public void sort(int [] inputArray) {

        super.sort(inputArray);
        quickSort(0, length - 1);

        // System.out.print("\nAfter Sort : ");
        // SortUtil.display(inputArray);
    }

    private void quickSort(int startIndex, int endIndex) {

        int i = startIndex;
        int j = endIndex;

        int pivotIndex = startIndex + (endIndex - startIndex) / 2;
        int pivot = inputArray[pivotIndex];

        while (i <= j) {
            // left side value from pivot (i.e. for values between startIndex and pivotIndex),
            // is less than pivot value. increment i
            while (inputArray[i] < pivot) {
                i++;
            }
            // right side value from pivot (i.e. for values between pivotIndex and endIndex ),
            // is less than pivot value. decrement i
            while (inputArray[j] > pivot) {
                j--;
            }

            if (i <= j) {
                SortUtil.swap(i, j, inputArray);
                i++;
                j--;
            }
        }

        if (startIndex < j)
            quickSort(startIndex, j);
        if (i < endIndex)
            quickSort(i, endIndex);
    }

    public static void main(String [] args) {
        Sortable sortable = new QuickSort();
        int [] input = {2, 0, 0, 2, 1, 4, 7, 0, 0, 4};

        System.out.println("\nBefore Sort : ");
        SortUtil.display(input);

        sortable.sort(input);

        System.out.println("\nAfter Sort : ");
        SortUtil.display(input);
    }

}
