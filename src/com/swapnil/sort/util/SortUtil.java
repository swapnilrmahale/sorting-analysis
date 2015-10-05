package com.swapnil.sort.util;

import java.util.Random;

/**
 * Created by swapn on 26-09-2015.
 */
public final class SortUtil {

    private static Random random = new Random();

    private SortUtil() {
    }

    public static int[] createArray(int length) {
        System.out.println("Generating Integer Array of length " + length);
        int[] array = new int[length];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = random.nextInt(i + 1);
        }
        return array;
    }

    public static void shuffleArray(int[] array) {
        System.out.println("Shuffling Array...");
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            swap(i, index, array);
        }
    }

    public static void swap(int i, int j, int[] inputArray) {
        int temp = inputArray[i];
        inputArray[i] = inputArray[j];
        inputArray[j] = temp;
    }

    public static void display(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}