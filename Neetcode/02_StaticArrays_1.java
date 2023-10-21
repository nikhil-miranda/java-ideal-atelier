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
