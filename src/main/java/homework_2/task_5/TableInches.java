package homework_2.task_5;

public class TableInches {
    public static void main(String[] args) {
        System.out.println("Дюймы, in" + " | " + " сантиметры, см ");

        for (int i = 1; i <= 20; i = i + 1) {
            double a = 1;
            a = i * 2.54;
            System.out.println(i + " | " + a);
        }


    }
}
