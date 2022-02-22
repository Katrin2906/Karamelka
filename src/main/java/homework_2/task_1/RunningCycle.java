package homework_2.task_1;

import static java.lang.System.out;

public class RunningCycle {
    public static void main(String[] args) {

        int t=0;
        int a=1;

        do {
            System.out.println("Прошло " + t + " часов, стало" +a +" амеб");
            t = t + 3;
            a=a*2;
        }
        while(t<=24);



    }

}
