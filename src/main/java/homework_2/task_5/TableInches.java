package homework_2.task_5;

public class TableInches {
    public static void main(String[] args) {
        System.out.println("Дюймы, in" + " | " + " сантиметры, см ");

        for (int inches = 1; inches <= 20; inches = inches + 1) {
            double sm = 1; // создание переменной стоит вынести за пределы цикла. Зачем ее каждый раз создавать заново?
            sm = inches * 2.54;
            System.out.println(inches + " | " + sm);
        }
// 12,13 строки можно удалить.

    }
}
