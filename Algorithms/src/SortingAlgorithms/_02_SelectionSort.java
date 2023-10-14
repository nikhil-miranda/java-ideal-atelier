package SortingAlgorithms;

import java.util.Arrays;

public class _02_SelectionSort {

    /**
     * Selection sort is an in-place comparison sorting algorithm.
     * It works by dividing the input array into two parts: the sub-array of items already sorted.
     * Sorted part is empty at the beginning. It's starts to increase from the right most side.
     * Unsorted part decreases with every iteration from right to left.
     * It's an unstable algorithm.
     * <p>
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     */

    public static void swap(int[] array, int p, int q) {
        if (p == q) return;

        int temporaryVariable = array[p];
        array[p] = array[q];
        array[q] = temporaryVariable;
    }

    public static void ascendingSelectionSort(int[] unsortedIntegerArray) {
        for (int lastUnsortedIndex = unsortedIntegerArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largestElementIndex = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (unsortedIntegerArray[i] > unsortedIntegerArray[largestElementIndex]) {
                    largestElementIndex = i;
                }
            }
            swap(unsortedIntegerArray, lastUnsortedIndex, largestElementIndex);
        }
        System.out.println(Arrays.toString(unsortedIntegerArray));
    }

    public static void descendingSelectionSort(int[] unsortedIntegerArray) {
        for (int lastUnsortedIndex = unsortedIntegerArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int smallestElementIndex = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (unsortedIntegerArray[i] < unsortedIntegerArray[smallestElementIndex]) {
                    smallestElementIndex = i;
                }
            }
            swap(unsortedIntegerArray, lastUnsortedIndex, smallestElementIndex);
        }
        System.out.println(Arrays.toString(unsortedIntegerArray));
    }

    public static void main(String[] args) {
        int[] unsortedIntegerArray = {20, 35, -15, 7, 55, 1, -22};

        ascendingSelectionSort(unsortedIntegerArray);
        descendingSelectionSort(unsortedIntegerArray);
    }

}
