package com.swapnil.sort.sorter;

import com.swapnil.sort.algo.*;

/**
 * Created by swapn on 28-09-2015.
 */
public enum SortingAlgorithm {

    BUBBLE_SORT_ALGORITHM(SortingAlgorithmName.BUBBLE_SORT, new BubbleSort()),
    BUCKET_SORT_ALGORITHM(SortingAlgorithmName.BUCKET_SORT, new BucketSort()),
    HEAP_SORT_ALGORITHM(SortingAlgorithmName.HEAP_SORT, new HeapSort()),
    INSERTION_SORT_ALGORITHM(SortingAlgorithmName.INSERTION_SORT, new InsertionSort()),
    MERGE_SORT_ALGORITHM(SortingAlgorithmName.MERGE_SORT, new MergeSort()),
    QUICK_SORT_ALGORITHM(SortingAlgorithmName.QUICK_SORT, new QuickSort()),
    SELECTION_SORT_ALGORITHM(SortingAlgorithmName.SELECTION_SORT, new SelectionSort());

    private final SortingAlgorithmName name;
    private final Sortable algorithm;

    SortingAlgorithm(final SortingAlgorithmName name, final Sortable algorithm) {
        this.name = name;
        this.algorithm = algorithm;
    }

    public static SortingAlgorithm getSortingAlgorithm(SortingAlgorithmName name) {
        SortingAlgorithm algorithm = null;
        switch (name) {
            case BUBBLE_SORT:
                algorithm = SortingAlgorithm.BUBBLE_SORT_ALGORITHM;
                break;

            case HEAP_SORT:
                algorithm = SortingAlgorithm.HEAP_SORT_ALGORITHM;
                break;

            case INSERTION_SORT:
                algorithm = SortingAlgorithm.INSERTION_SORT_ALGORITHM;
                break;

            case MERGE_SORT:
                algorithm = SortingAlgorithm.MERGE_SORT_ALGORITHM;
                break;

            case QUICK_SORT:
                algorithm = SortingAlgorithm.QUICK_SORT_ALGORITHM;
                break;

            case SELECTION_SORT:
                algorithm = SortingAlgorithm.SELECTION_SORT_ALGORITHM;
                break;

            case BUCKET_SORT:
            	algorithm = SortingAlgorithm.BUBBLE_SORT_ALGORITHM;
            	break;
            	
            default:
                System.err.println("No Such Algorithm Defined");
        }
        return algorithm;
    }

    public Sortable getAlgorithm() {
        return algorithm;
    }

    public SortingAlgorithmName getName() {
        return name;
    }
}
