import java.util.Arrays;

public class StaticArrays {

    /**
     * Question: 1
     *
     * @param numberArray
     * @return
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
}
