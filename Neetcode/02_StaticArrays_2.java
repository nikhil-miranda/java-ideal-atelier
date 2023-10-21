/**
 * Question: #2
 *
 * @param nums
 * @param val
 * @return
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
