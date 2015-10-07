package com.swapnil.sort.algo;

/**
 * Created by swapn on 26-09-2015.
 */
public abstract class Sortable {

    protected int inputArray[];
    protected int length;

    private void preSort(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            System.err.println("Input Array is Empty");
            return;
        }
        this.inputArray = inputArray;
        this.length = inputArray.length;
    }

    public void sort(int[] inputArray) {
        preSort(inputArray);
        // System.out.println("\n\n - - - - - " + this.getClass().getSimpleName() + " - - - - -");
        // System.out.print("\nBefore Sort : ");
        // SortUtil.display(inputArray);
    }
}
