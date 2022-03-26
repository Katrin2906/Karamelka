package homework_7.task_7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BenchmarkTest {
    public static void main(String[] args) {
        String myString = "B";
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();

        int count = 200000;
        String change="r...";

        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            myString = myString.concat(change);
        }
        long finish = System.currentTimeMillis();
        System.out.println("String=" + (finish - start));
        // new java.text.SimpleDateFormat -> new SimpleDateFormat - у тебя появится импорт вверху, влад на прошлом занятии спрашивал что это
        System.out.println(new java.text.SimpleDateFormat(" HH:mm:ss").format(new java.util.Date((finish - start) * 1000))); // этот кусок кода часто повторяется, вынеси его в отдельный метод


        start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            stringBuilder.append(change);
        }
        finish = System.currentTimeMillis();
        System.out.println("StringBuilder=" + (finish - start));
        System.out.println(new java.text.SimpleDateFormat(" HH:mm:ss").format(new java.util.Date((finish - start) * 1000)));


        start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            stringBuffer.append(change);
        }
        finish = System.currentTimeMillis();
        System.out.println("StringBuffer=" + (finish - start));
        System.out.println(new java.text.SimpleDateFormat(" HH:mm:ss").format(new java.util.Date((finish - start) * 1000)));

    }
}
