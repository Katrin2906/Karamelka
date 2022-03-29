package homework_8.task_1;

public class DivisionMain {
    public static void main(String[] args) {
// лишняя строка
        try {
            Division.Division(15, 0);
        } catch (Exception e) { // Exception замени на ArithmeticException
            System.out.println("На 0 в Java целые числа не делят");
        }
    }
}
