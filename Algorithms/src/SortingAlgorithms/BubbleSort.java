package SortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {
    /**
     * This algorithm is used to sort an array of elements.
     * It's In-Place Algorithm (no need for extra memory)
     * It works by comparing two adjacent elements and swapping them if they are not in the intended order.
     * This process is repeated until the array is sorted.
     * <p>
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     */

    public static void swap(int[] integerArray, int p, int q) {
        if (p == q) return;

        int temporaryVariable = integerArray[p];
        integerArray[p] = integerArray[q];
        integerArray[q] = temporaryVariable;
    }

    public static void ascendingBubbleSort(int[] sampleIntegerArray) {
        for (int n = sampleIntegerArray.length - 1; n > 0; n--) {
            for (int i = 0; i < n; i++) {
                if (sampleIntegerArray[i] > sampleIntegerArray[i + 1]) {
                    swap(sampleIntegerArray, i, i + 1);
                }
            }
        }

        System.out.println(Arrays.toString(sampleIntegerArray));
    }

    public static void descendingBubbleSort(int[] sampleIntegerArray) {
        for (int n = sampleIntegerArray.length - 1; n > 0; n--) {
            for (int i = 0; i < n; i++) {
                if (sampleIntegerArray[i] < sampleIntegerArray[i + 1]) {
                    swap(sampleIntegerArray, i, i + 1);
                }
            }
        }

        System.out.println(Arrays.toString(sampleIntegerArray));
    }

    public static void main(String... args) {
        int[] sampleIntegerArray = {-12, 7, 20, 1, 22, 35, 55};

        ascendingBubbleSort(sampleIntegerArray);
        descendingBubbleSort(sampleIntegerArray);
    }

}
