package com.swapnil.sort.algo;

import com.swapnil.sort.util.SortUtil;

/**
 * Created by swapn on 30-09-2015.
 */
public class MergeSort extends Sortable {

    private int[] tempArray;

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
        tempArray = new int[length];
        mergeSort(0, length - 1);
    }

    private void mergeSort(int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {
            int middleIndex = lowerIndex + (higherIndex - lowerIndex) / 2;

            mergeSort(lowerIndex, middleIndex);

            mergeSort(middleIndex + 1, higherIndex);

            merge(lowerIndex, middleIndex, higherIndex);
        }
    }

    private void merge(int lowerIndex, int middleIndex, int higherIndex) {

        /* Copy inputArray content to tempArray */
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempArray[i] = inputArray[i];
        }

        int i = lowerIndex;
        int j = middleIndex + 1;
        int k = lowerIndex;

        /* Start traversing from lowerIndex of left side array
            and lowerIndex of right side array (i.e. middleIndex + 1).
         */
        while (i <= middleIndex && j <= higherIndex) {
            if (tempArray[i] <= tempArray[j]) { // If left side array contains lower value then copy that to inputArray
                inputArray[k] = tempArray[i];
                i++;
            } else { // If right side array contains lower value then copy that to inputArray
                inputArray[k] = tempArray[j];
                j++;
            }
            k++; // increment index of input array
        }

        /* Copy the remaining items from left side array as it is to inputArray */
        while (i <= middleIndex) {
            inputArray[k] = tempArray[i];
            i++;
            k++;
        }
    }

}
