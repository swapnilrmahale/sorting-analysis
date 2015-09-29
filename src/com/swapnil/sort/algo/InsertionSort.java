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
        }
    }

    public static void main(String [] args) {
        Sortable sortable = new BubbleSort();
        int [] input = {2, 0, 0, 2, 1, 4, 7, 0, 0, 4};

        System.out.println("\nBefore Sort : ");
        SortUtil.display(input);

        sortable.sort(input);

        System.out.println("\nAfter Sort : ");
        SortUtil.display(input);
    }

}
