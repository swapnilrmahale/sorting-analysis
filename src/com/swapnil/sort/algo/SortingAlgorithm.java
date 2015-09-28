package com.swapnil.sort.algo;

/**
 * Created by swapn on 28-09-2015.
 */
public enum SortingAlgorithm {

    BUBBLE_SORT_ALGORITHM(SortingAlgorithmName.BUBBLE_SORT, new BubbleSort()),
    INSERTION_SORT_ALGORITHM(SortingAlgorithmName.INSERTION_SORT, new InsertionSort()),
    QUICK_SORT_ALGORITHM(SortingAlgorithmName.QUICK_SORT, new QuickSort());

    private final SortingAlgorithmName name;
    private final Sortable algorithm;

    private SortingAlgorithm(final SortingAlgorithmName name, final Sortable algorithm) {
        this.name = name;
        this.algorithm = algorithm;
    }

    public static SortingAlgorithm getSortingAlgorithm(SortingAlgorithmName name) {
        SortingAlgorithm algorithm = null;
        switch (name) {
            case BUBBLE_SORT:
                algorithm = SortingAlgorithm.BUBBLE_SORT_ALGORITHM;
                break;

            case INSERTION_SORT:
                algorithm = SortingAlgorithm.INSERTION_SORT_ALGORITHM;
                break;

            case QUICK_SORT:
                algorithm = SortingAlgorithm.QUICK_SORT_ALGORITHM;
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
