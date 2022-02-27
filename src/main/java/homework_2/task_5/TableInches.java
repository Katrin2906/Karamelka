package homework_2.task_5;

public class TableInches {
    public static void main(String[] args) {
        System.out.println("Дюймы, in" + " | " + " сантиметры, см ");

        for (int inches = 1; inches <= 20; inches = inches + 1) {
            double sm = 1;
            sm = inches * 2.54;
            System.out.println(inches + " | " + sm);
        }


    }
}
