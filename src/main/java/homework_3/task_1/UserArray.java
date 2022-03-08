package homework_3.task_1;

        import java.util.Arrays;
        import java.util.Scanner;

public class UserArray {
    public static void main(String[] args) {
        int[] userArray = new int[3];
        int summ = 0;

        for (int i = 0; i < userArray.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter array element ");
            userArray[i] = scanner.nextInt();
            summ = summ + userArray[i];
        }

        int min = userArray[0];
        int max = userArray[0];
        for (int i : userArray) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Final array " + Arrays.toString(userArray));
        System.out.println("Summ " + summ);
        System.out.println("Min element " + min);
        System.out.println("Max element " + max);
    }
}