package homework_2.task_6;

public class EvenNumber {
    public static void main(String[] args) {
        // твоя программа работает, но не совсем корректна. Лучше добавить if() с проверкой на четность, а не шагать even+2
        for (int even = 2; even <= 100; even = even + 2) {
            System.out.print(even + " | ");
        }
    }
}
