package homework_2.task_1;

import static java.lang.System.out;

public class RunningCycle {
    public static void main(String[] args) {

        int d=1;
        float l=10;
        float s=0;

        while(d<=7){

            l=l+(l/10);
            s=s+l;

            System.out.println(d);
            System.out.println(l);
            System.out.println(s);
            d=d+1;
        }System.out.println(s);



    }

}
