package homework_2.task_9;

public class TriangleTwo {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) { // внешний цикл считает количество линий и запускает вложенные циклы

            for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }

            System.out.println();
        }

    }
}
