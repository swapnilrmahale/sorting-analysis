package com.swapnil.sort.algo;

import com.swapnil.sort.util.SortUtil;

/**
 * Created by swapn on 27-09-2015.
 */
public class InsertionSort  extends Sortable {

    @Override
    public void sort(int [] inputArray) {
        super.sort(inputArray);
        insertionSort();

        // System.out.print("\nAfter Sort : ");
        // SortUtil.display(inputArray);
    }

    private void insertionSort() {
        for (int i = 1; i < length; i++) {
            int key = inputArray[i];
            int j = i - 1;

            while (( j > -1) && (inputArray[j] > key) ) {
                inputArray[j+1] = inputArray[j];
                j--;
            }

            inputArray[j+1] = key;

            // System.out.print("\nAfter Run Number : " + i + " --> ");
            // SortUtil.display(inputArray);

        }
    }
}
