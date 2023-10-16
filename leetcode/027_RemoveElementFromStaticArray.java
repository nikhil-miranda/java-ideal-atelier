/**
 * Number: 22
 * Title: Remove Element from Static Array.
 * Question: Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
 *
 * Test Case 1: [3,2,2,3]
 * Test Case 2: [0,1,2,2,3,0,4,2]
 */
public static int removeElement(int[] nums, int val) {
    int arrayLength = nums.length;
    int[] modifiedArray = new int[arrayLength];
    int index = 0;
    for (int i = 0; i < arrayLength; i++) {
        if (nums[i] != val) {
            modifiedArray[index] = nums[i];
            index++;
        }
    }
    System.out.println("modifiedArray = " + Arrays.toString(modifiedArray));
    return modifiedArray.length;
}
