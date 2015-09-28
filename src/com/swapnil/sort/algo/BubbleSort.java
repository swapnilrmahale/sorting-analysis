package com.swapnil.sort.algo;

import com.swapnil.sort.util.SortUtil;

/**
 * Created by swapn on 26-09-2015.
 */
public class BubbleSort extends Sortable{

    @Override
    public void sort(int [] inputArray) {
        super.sort(inputArray);

        bubbleSort();

        // System.out.print("\nAfter Sort : ");
        // SortUtil.display(inputArray);
    }

    private void bubbleSort() {
        for (int outerIndex = 0; outerIndex < length; outerIndex++) {

            for (int innerIndex = 1; innerIndex < length - 1; innerIndex++) {

                if (inputArray[innerIndex - 1] > inputArray[innerIndex]) {
                    SortUtil.swap(innerIndex - 1, innerIndex, inputArray);
                }
            }

            // System.out.print("\nAfter Run Number : " + (outerIndex + 1) + " --> ");
            // SortUtil.display(inputArray);
        }
    }
}
