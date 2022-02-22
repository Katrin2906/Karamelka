package homework_2.task_2;

public class DuplicationAmoebas {
    public static void main(String[] args) {

        int t = 0; // время
        int a = 1; // амебы

        do {
            System.out.println("Прошло " + t + " часа(-ов), стало " + a + " амеб(-ы)");
            t = t + 3;
            a = a * 2;
        }
        while (t <= 24);


    }

}

