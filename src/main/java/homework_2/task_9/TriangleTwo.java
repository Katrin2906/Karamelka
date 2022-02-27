package homework_2.task_9;

 // эту задачу надо решить в рамках одного класса, чтобы на экране появилось сразу два треугольника
public class TriangleTwo {
    public static void main(String[] args) {

        for (int outer = 1; outer <= 4; outer++) {

            for (int sign = 4; sign >= outer; sign--) {
                System.out.print("*");
            }

            for (int space = 1; space<= outer; space++) {
                System.out.print(" ");
            }

            System.out.println();
        }

    }
}
