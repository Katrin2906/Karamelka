package homework_2.task_9;

public class TriangleOne {
    public static void main(String[] args) {

        for (int outer = 0; outer <= 4; outer++) {

            for (int space = 4; space > outer; space--) {
                System.out.print(" ");
            }

            for (int sign = 0; sign <= outer - 1; sign++) { // второй цикл считает количество знаков
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
