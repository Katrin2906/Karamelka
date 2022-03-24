package homework_7.task_7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BenchmarkTest {
    public static void main(String[] args) {
        String myString = "B";
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();

        int count = 200000;

        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            myString = myString.concat("r...");
        }
        long finish = System.currentTimeMillis();
        System.out.println("String=" + (finish - start));
        System.out.println(new java.text.SimpleDateFormat(" HH:mm:ss").format(new java.util.Date((finish - start) * 1000)));


        start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            stringBuilder.append("r...");
        }
        finish = System.currentTimeMillis();
        System.out.println("StringBuilder=" + (finish - start));
        System.out.println(new java.text.SimpleDateFormat(" HH:mm:ss").format(new java.util.Date((finish - start) * 1000)));


        start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            stringBuffer.append("r...");
        }
        finish = System.currentTimeMillis();
        System.out.println("StringBuffer=" + (finish - start));
        System.out.println(new java.text.SimpleDateFormat(" HH:mm:ss").format(new java.util.Date((finish - start) * 1000)));

    }
}