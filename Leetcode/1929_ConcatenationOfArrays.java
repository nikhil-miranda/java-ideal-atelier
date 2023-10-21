/**
 * Number: 1929
 * Title: Concatenation of 2 arrays
 * Question: Given an integer array nums of length n, you want to create an array ans of
 * length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
 * Specifically, ans is the concatenation of two nums arrays.Return the array ans.
 *
 * Test Case 1: [1,2,1]
 * Test Case 2: [1,3,2,1]
 */

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] arr = new int[2 * n];
        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
            arr[i+n] = nums[i];
        }
        return arr;
    }
}
