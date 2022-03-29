package homework_8.task_3;

import java.util.InputMismatchException;
import java.util.Scanner;

// твоей программе явно не хватает цикла. Т.е. если пользователь ввел некорректное число, то программа еще раз просит ввести число, а не завершает работу
// сделай while(true) с выходом через break или какой-нибудь флаг boolean askUserAgain, который поменяешь на false когда пользователь введет корректные данные
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
            System.out.println("Incorrect number.Try again."); // явно не хватает информации. Скажи пользователю про длинну массива и положительные числа
        }
    }
}
