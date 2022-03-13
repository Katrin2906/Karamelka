package homework_3.task_5;

import java.util.Arrays;

public class InvertArray {
    public static void main(String[] args) {
        int[] invertArray = new int[10];
        for (int i = 0; i < invertArray.length; i++) {
            invertArray[i] = i;
        }
        System.out.println("First array " + Arrays.toString(invertArray));

        for (int i = 0; i < invertArray.length / 2; i++) {
            int revers = invertArray[i];
            invertArray[i] = invertArray[invertArray.length - 1 - i]; // invertArray.length - 1 - r можно вынести в переменную int lastRightElement
            invertArray[invertArray.length - 1 - i] = revers;
        }
        System.out.println("Revers array : " + Arrays.toString(invertArray));
    }
}
