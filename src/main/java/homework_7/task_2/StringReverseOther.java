package homework_7.task_2;

public class StringReverseOther {

    public static String reverseString(String reverse) {
        String result = "";
        for (int i = 0; i < reverse.length(); i++) { // а не проще было бы бежать с конца строки?
            result = reverse.charAt(i) + result;
        }
        return result;
    } // абзац
    public static void main(String[] args) { // метод main должен идти первым в классе
        System.out.println(reverseString("alucard"));
    }
}

