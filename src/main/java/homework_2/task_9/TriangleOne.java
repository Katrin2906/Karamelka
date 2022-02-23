package homework_2.task_9;

public class TriangleOne {
    public static void main(String[] args) {

        for (int i = 0; i <= 4; i++) { // внешний цикл считает количество линий и запускает вложенные циклы

            for (int j = 4; j > i; j--) { // первый цикл считает количество пробелов
                System.out.print(" ");
            }

            for (int k = 0; k <= i - 1; k++) { // второй цикл считает количество знаков
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
