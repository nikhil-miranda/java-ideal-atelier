package competitive;

import java.util.Arrays;
import java.util.Stack;

public class Scratch {

    public static int numberOfSteps(int num) {
        int counter = 0;
        if (num < 0) {
            return 0;
        }
        while (num > 0 ) {
            if (num % 2 == 0) {
                num = num / 2;
                if (num % 2 == 1) {
                    num = num - 1;
                    counter++;
                }
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        String s = "(){}[{]";
        int num = 14;
        System.out.println("Result = " + numberOfSteps(num));
    }

}
