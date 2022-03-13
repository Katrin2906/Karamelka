package homework_3.task_4;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        // не очень красиво вывело на экран, но работает
        int tableSize = 11;
        int[][] tableArray = new int[tableSize][tableSize];

        for (int i = 1; i < tableArray.length; i++) {
            for (int j = 1; j < tableArray[i].length; j++) {
                tableArray[i][j] = i * j;
            }
        }
        for (int i = 1; i < tableArray.length; i++) {
            System.out.println(i + " | " + Arrays.toString(tableArray[i]));
        }
    }
}

