package homework_3.task_5;

import java.util.Arrays;

public class InvertArray {
    public static void main(String[] args) {
        int[] invertArray = new int[10];
        for (int i = 0; i < invertArray.length; i++) {
            invertArray[i] = i;
        }
        System.out.println("First array " + Arrays.toString(invertArray));

        for (int r = 0; r < invertArray.length / 2; r++) {
            int revers = invertArray[r];
            invertArray[r] = invertArray[invertArray.length - 1 - r];
            invertArray[invertArray.length - 1 - r] = revers;

        }
        System.out.println("Revers array : " + Arrays.toString(invertArray));
    }
}
