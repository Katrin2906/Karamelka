package homework_7.task_6;

import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {

        String[] oldWords = {"World", "dog", "stolen", "Ann", "Wendy", "Egorka" };
        int count = 0;

        for (int i = 0; i < oldWords.length; i++)

        {
            if (oldWords[i].contains("W")) {

                System.out.println("нашел " + oldWords[i]);
                count++;
                String[] newWords = new String[count];

                for (int j = 0; j < count; j++) {

                    if (oldWords[i].contains("W")){
                    newWords[j] = oldWords[i];}
                }
                System.out.println(Arrays.toString(newWords));
            }
            }
        }
    }


