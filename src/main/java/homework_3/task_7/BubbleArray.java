package homework_3.task_7;

import java.util.Arrays;

public class BubbleArray {
    public static void main(String[] args) {

        int[] bubbleArray = {4, 15, 178, -23, 0, 0, 1000};
        boolean sorted = false;
        int sort; // sort - больше похоже на переменную типа boolean, temp/tmp/replacement и т.д. здесь больше подойдет
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < bubbleArray.length - 1; i++) {
                if (bubbleArray[i] > bubbleArray[i + 1]) {
                    sort = bubbleArray[i];
                    bubbleArray[i] = bubbleArray[i + 1];
                    bubbleArray[i + 1] = sort;
                    sorted = false;
                }
            }
        }
        System.out.println("Final array: " + Arrays.toString(bubbleArray));
    }
}