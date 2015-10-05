package com.swapnil.sort.algo;

import com.swapnil.sort.util.SortUtil;

/**
 * Created by swapn on 26-09-2015.
 */
public class BubbleSort extends Sortable {

    public static void main(String[] args) {
        Sortable sortable = new BubbleSort();
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

        bubbleSort();

    }

    private void bubbleSort1() {
        for (int outerIndex = 0; outerIndex < length; outerIndex++) {

            for (int innerIndex = 1; innerIndex < length; innerIndex++) {

                if (inputArray[innerIndex - 1] > inputArray[innerIndex]) {
                    SortUtil.swap(innerIndex - 1, innerIndex, inputArray);
                }
            }

            System.out.print("\nAfter Iteration Number " + (outerIndex + 1) + " : ");
            SortUtil.display(inputArray);
        }
    }

    private void bubbleSort() {
        boolean isSwapped;
        int iterationNumber = 1;

        do {
            isSwapped = false;
            for (int innerIndex = 1; innerIndex < length; innerIndex++) {
                if (inputArray[innerIndex - 1] > inputArray[innerIndex]) {
                    SortUtil.swap(innerIndex - 1, innerIndex, inputArray);
                    isSwapped = true;
                }
            }

            /*System.out.print("\nAfter Iteration Number " + iterationNumber++ + " : ");
            SortUtil.display(inputArray);*/

        } while (isSwapped);
    }
}

