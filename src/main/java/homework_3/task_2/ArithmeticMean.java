package homework_3.task_2;

import java.util.Arrays;
import java.util.Scanner;

public class ArithmeticMean {
    public static void main(String[] args) {
        double summ = 0;
        double mean = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length ");
        int х = scanner.nextInt(); // x - это длина массива, вот и назови переменную arrayLength
        int[] arrayMean = new int[х];

        for (int i = 0; i < arrayMean.length; i=++i) { // i = ++i - это некорректная запись, просто i++
            arrayMean[i] = i;
            summ = summ + arrayMean[i];
        }
        mean = summ / arrayMean.length;

        System.out.println("Final array " + Arrays.toString(arrayMean));
        System.out.println("Summ " + summ);
        System.out.println("Arithmetic mean " + mean);
    }
}
