package homework_3.task_3;

import java.util.Arrays;
import java.util.Scanner;

public class OddArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length ");
        int х = scanner.nextInt();
        int[] OddArray = new int[х];


        for (int i = 0; i < OddArray.length; ++i) {
            OddArray[i] = i;
        }
        System.out.println("Initial array " + Arrays.toString(OddArray));

        for (int i = 0; i < OddArray.length; ++i) {
            if (OddArray[i] % 2 != 0) {
                OddArray[i] = 0;
            }
        }
        System.out.println("Final array " + Arrays.toString(OddArray));
    }
}
