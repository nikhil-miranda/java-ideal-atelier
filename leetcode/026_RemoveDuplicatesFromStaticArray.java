import java.util.Arrays;

public class RemoveDuplicatesFromStaticArray26 {

    public static void main(String[] args) {

        /**
         * Number: 26
         * Title: Remove Duplicates from Sorted Array.
         * Question: Given an integer array 'nums' sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
         *
         * Test Case 1: [1,1,2]
         * Test Case 2: [0,0,1,1,1,2,2,3,3,4]
         */

        int[] numberArray = {1,1,2};
        System.out.println(removeDuplicates(numberArray));
    }

    public static int removeDuplicates(int[] numberArray) {

        // Length of the updated array
        int count = 0;

        // Loop for all the elements in the array
        for (int i = 0; i < numberArray.length; i++) {

            // If the current element is equal to the next element, we skip
            if (i < numberArray.length - 1 && numberArray[i] == numberArray[i + 1]) {
                continue;
            }

            // We will update the array in place
            numberArray[count] = numberArray[i];
            count++;

        }
        return count;
    }
}
