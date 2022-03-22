package homework_7.task_2;

public class StringReverseOther {

    public static String reverseString(String reverse) {
        String result = "";
        for (int i = 0; i < reverse.length(); i++) {
            result = reverse.charAt(i) + result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseString("alucard"));
    }
}

