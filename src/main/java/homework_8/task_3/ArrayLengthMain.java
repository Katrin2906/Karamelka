package homework_8.task_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayLengthMain {
    public static void main(String[] args) throws ArrayExeption {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a new number");
            int arrayLength = scanner.nextInt();

            ArrayLength newLength = new ArrayLength();
            newLength.find(arrayLength);
            int[] localArray=new int[arrayLength];

        } catch (InputMismatchException e) {
            System.out.println("Incorrect format, try again");
        } catch (ArrayExeption ex) {
            System.out.println("Incorrect number.Try again.");
        }
    }
}