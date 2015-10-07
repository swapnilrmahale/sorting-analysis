package com.swapnil.sort.main;

import com.swapnil.sort.algo.Sortable;
import com.swapnil.sort.sorter.SortingAlgorithm;
import com.swapnil.sort.sorter.SortingAlgorithmName;
import com.swapnil.sort.util.FileUtil;
import com.swapnil.sort.util.SortUtil;

import java.io.IOException;

/**
 * Created by swapn on 26-09-2015.
 */
public class Main {

    //private static final String reportFilePath = "F:\\Swapnil\\Sorting_Analysis_Report.csv";
    
    // Office Location
    private static final String reportFilePath = "/home/swapper/labs/";

    private static final int[] NUMBER_OF_ELEMENTS_IN_EACH_SET = {100, 1000, 10000, 20000, 40000, 60000};
    private static final int SHUFFLE_EACH_SET_COUNT = 1;


    public static void main(String[] args) {

        int numberOfSets = NUMBER_OF_ELEMENTS_IN_EACH_SET.length;
        int elementsInSet;
        int[] newArray;

        long startTime, endTime, duration;
        String line;
        Sortable sorter = null;

        try {

            if (FileUtil.isFileExist(reportFilePath)) {
                FileUtil.backupFile(reportFilePath);
            }
            FileUtil.writeToFile(reportFilePath, "ALGORITHM_NAME, SET_NUMBER(ELEMENTS_COUNTS), SHUFFLE_NUMBER, DURATION (NANOSECONDS), DURATION (MILLISECONDS) \n");

            for (int setNumber = 0; setNumber < numberOfSets; setNumber++) {

                for (int shuffleNumber = 1; shuffleNumber <= SHUFFLE_EACH_SET_COUNT; shuffleNumber++) {

                    elementsInSet = NUMBER_OF_ELEMENTS_IN_EACH_SET[setNumber];
                    newArray = SortUtil.createArray(elementsInSet);
                    SortUtil.shuffleArray(newArray);

                    for (SortingAlgorithmName algorithmName : SortingAlgorithmName.values()) {
                        SortingAlgorithm algorithm = SortingAlgorithm.getSortingAlgorithm(algorithmName);
                        sorter = algorithm.getAlgorithm();
                        startTime = System.nanoTime();

                        sorter.sort(newArray.clone());

                        endTime = System.nanoTime();
                        duration = (endTime - startTime);

                        line = algorithm.getName() + "," + (setNumber + 1) + "(" + elementsInSet + ")" + ","
                                + shuffleNumber + "," + duration + "," + (duration / 1000000) + "\n";
                        FileUtil.writeToFile(reportFilePath, line);
                    }
                }
            }

        } catch (IOException ioException) {
            System.err.println("File Handling Error Occurred. " + ioException.getMessage());
            ioException.printStackTrace();

        } catch (Exception exception) {
            System.err.println("Unknown Error Occurred. " + exception.getMessage());
            exception.printStackTrace();
        }
    }
}
