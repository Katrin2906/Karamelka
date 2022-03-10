package homework_3.task_4;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        int[][] tableArray = new int[11][11];

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

