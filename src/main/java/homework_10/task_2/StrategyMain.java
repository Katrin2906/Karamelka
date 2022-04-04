package homework_10.task_2;

public class StrategyMain {
    public static void main(String[] args) {

        String[] name = {"Tjknj98hj", "HgtTTTjjn", "O_JINjy"};

        for (int i = 0; i < name.length; i++) {
            Strategy file = Strategy.LOWERCASE;
            System.out.println(file.rename(name[i]));
            Strategy file1 = Strategy.UPPERCASE;
            System.out.println(file1.rename(name[i]));
            Strategy file2 = Strategy.UPPERFIRST;
            System.out.println(file2.rename(name[i]));
        }
    }
}