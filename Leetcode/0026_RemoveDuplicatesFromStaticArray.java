/**
 * Number: 26
 * Title: Remove Duplicates from Sorted Array.
 * Question: Given an integer array 'nums' sorted in non-decreasing order, remove the duplicates
 * in-place such that each unique element appears only once. The relative order of the elements
 * should be kept the same. Then return the number of unique elements in nums.
 *
 * Test Case 1: [1,1,2]
 * Test Case 2: [0,0,1,1,1,2,2,3,3,4]
 */
public static int removeDuplicates(int[] numberArray) {
    int count = 0;
    for (int i = 0; i < numberArray.length; i++) {
        if (i < numberArray.length - 1 && numberArray[i] == numberArray[i + 1]) {
            continue;
        }

        numberArray[count] = numberArray[i];
        count++;
    }
    return count;
}
