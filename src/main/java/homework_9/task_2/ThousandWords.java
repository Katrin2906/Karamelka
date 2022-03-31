package homework_9.task_2;

import java.io.FileWriter;
import java.io.IOException;

public class ThousandWords {
    public static void main(String[] args) throws IOException {
        String words = "No regrets ";
        String manyWords = words.repeat(1000);
        FileWriter newManyWords = new FileWriter("src/main/java/homework_9/task_2/manyWords");
        newManyWords.write(manyWords);
        newManyWords.flush();
    }
}
