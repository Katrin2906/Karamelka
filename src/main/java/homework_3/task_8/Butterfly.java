package homework_3.task_8;

import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        // just one wing((
        // but i'm still working

        // представь что ты печатаешь двумерный массив
        // тебе надо понять сколько элементов печатать в каждой строке, т.е.
        // в первой строке ты печатаешь 1 цифру (1 слева и 1 справа, т.е. первую и последнюю)
        // во второй строке - 2 цифры (2 слева и 2 справа)
        // получается что вложенный цикл сначала идет до i < 1 -> i < 2 ... и т.д.
        // а на экран выводишь i (это будет левая часть) и array.length - i (это будет правое крыло)
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
