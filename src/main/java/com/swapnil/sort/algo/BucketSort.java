package com.swapnil.sort.algo;

import com.swapnil.sort.util.SortUtil;

public class BucketSort extends Sortable {

	public static void main(String[] args) {
		Sortable sortable = new BucketSort();
		int[] input = { 2, 0, 0, 2, 1, 4, 7, 0, 0, 4 };

		System.out.println("\nBefore Sort : ");
		SortUtil.display(input);

		sortable.sort(input);

//		System.out.println("\nAfter Sort : ");
//		SortUtil.display(input);
	}

	@Override
	public void sort(int[] inputArray) {
		super.sort(inputArray);

		int maxValue = SortUtil.maxValue(inputArray);

		int [] outputArray = bucketSort(maxValue);
		System.out.println("\n");
		SortUtil.display(outputArray);

	}

	private int[] bucketSort(int maxValue) {
		// Bucket Sort
		int[] Bucket = new int[maxValue + 1];
		int[] sorted_sequence = new int[inputArray.length];

		for (int i = 0; i < length; i++)
			Bucket[inputArray[i]]++;

		int outPos = 0;
		for (int i = 0; i < Bucket.length; i++)
			for (int j = 0; j < Bucket[i]; j++)
				sorted_sequence[outPos++] = i;

		return sorted_sequence;
	}

}
