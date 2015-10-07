package com.swapnil.sort.algo;

import com.swapnil.sort.util.SortUtil;

/**
 * Created by swapn on 29-09-2015.
 */
public class SelectionSort extends Sortable {

    public static void main(String[] args) {
        Sortable sortable = new SelectionSort();
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

        selectionSort();
    }

    private void selectionSort() {
        for (int outerIndex = 0; outerIndex < length; outerIndex++) {

            /* Find the minimum value in the unsorted array */
            // assume outerIndex has the minimum value
            int minValueIndex = outerIndex;
            for (int innerIndex = outerIndex + 1; innerIndex < length; innerIndex++) {
                if (inputArray[innerIndex] < inputArray[minValueIndex]) {
                    minValueIndex = innerIndex;
                }
            }

            // If Minimum Value Index is not equal to assumed Outer Index Value then swap the values.
            if (minValueIndex != outerIndex) {
                SortUtil.swap(outerIndex, minValueIndex, inputArray);
            }

            /* So, in each iteration minimum value of unsorted list will be swapped */
        }
    }
}
