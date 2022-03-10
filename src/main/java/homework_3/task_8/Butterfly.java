package homework_3.task_8;

import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        // just one wing((
        // but i'm still working

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width of butterfly wing");
        int w = scanner.nextInt();

        for (int width = 0; width < w; width++) {
            for (int high = 1; high <= width + 1; high++) {
                System.out.print(high);
            }
            System.out.println();

        }
        for (int width = w; width >= 0; width--) {
            for (int high = 1; high < width; high++) {
                System.out.print(high);
            }
            System.out.println();

        }
    }
}
