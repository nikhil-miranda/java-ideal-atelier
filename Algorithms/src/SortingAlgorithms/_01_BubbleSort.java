package SortingAlgorithms;

import java.util.Arrays;

public class _01_BubbleSort {

    /**
     * This algorithm is used to sort an array of elements.
     * It's In-Place Algorithm (no need for extra memory)
     * It works by comparing two adjacent elements and swapping them if they are not in the intended order.
     * This process is repeated until the array is sorted.
     *
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     */

    public static void swap(int[] integerArray, int p, int q) {
        if (p == q) return;

        int temporaryVariable = integerArray[p];
        integerArray[p] = integerArray[q];
        integerArray[q] = temporaryVariable;
    }

    public static void ascendingBubbleSort(int[] unsortedIntegerArray) {
        for (int lastUnsortedIndex = unsortedIntegerArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (unsortedIntegerArray[i] > unsortedIntegerArray[i + 1]) {
                    swap(unsortedIntegerArray, i, i + 1);
                }
            }
        }
        System.out.println(Arrays.toString(unsortedIntegerArray));
    }

    public static void descendingBubbleSort(int[] unsortedIntegerArray) {
        for (int lastUnsortedIndex = unsortedIntegerArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (unsortedIntegerArray[i] < unsortedIntegerArray[i + 1]) {
                    swap(unsortedIntegerArray, i, i + 1);
                }
            }
        }
        System.out.println(Arrays.toString(unsortedIntegerArray));
    }

    public static void main(String... args) {
        int[] sampleIntegerArray = {20, 35, -15, 7, 55, 1, -22};

        ascendingBubbleSort(sampleIntegerArray);
        descendingBubbleSort(sampleIntegerArray);
    }

}
