package homework_3.task_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class OddArray {
    public static void main(String[] args) {
        // а зачем оставила столько законмментированного кода? если не нужен, то удаляй
        //Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter array length ");
        //int х = scanner.nextInt();
        //int[] oddArray = new int[х];
        Random r = new Random(); // называй переменные согласно тому, что они в себе хранят. В данном случае r -> random
        int x = r.nextInt(50); // x -> randomInt
        int[] oddArray = new int[x];

        for (int i = 0; i < oddArray.length; ++i) {
            oddArray[i] = i;
        }
        System.out.println("Initial array " + Arrays.toString(oddArray));

        for (int i = 0; i < oddArray.length; ++i) {
            if (oddArray[i] % 2 != 0) {
                oddArray[i] = 0;
            }
        }
        System.out.println("Final array " + Arrays.toString(oddArray));
    }
}
