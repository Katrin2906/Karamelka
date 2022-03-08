package homework_2.task_4;

public class Multiplication {
    public static void main(String[] args) {
        int a = 1;
        int b = -1;

        int mult = 0;
        if (a == 0 || b == 0) {
            System.out.println("результат 0");;
        }
        if (b == 1) {
            System.out.println("результат " +a);;
        }
        if (a == 1) {
            System.out.println("результат " +b);;
        }

        if (a > 0 && b < 0 || b > 0 && a < 0) {
            if (Math.abs(a) > Math.abs(b)) {
                for (int i = 0; i < Math.abs(b); ++i) {
                    mult = mult + Math.abs(a);
                }
            } else {
                for (int i = 0; i < Math.abs(a); ++i) {
                    mult = mult + Math.abs(b);
                }
            }
            if (a < 0 || b < 0) {
                System.out.println(mult);
            } else {
                System.out.println(-mult);
            }
        }
    }
}


