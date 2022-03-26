package homework_7.task_4;

public class FindWords {
    public static void main(String[] args) {
        Counter alert = new Counter("alert");
        Counter add = new Counter("add");
        Counter good = new Counter("good");
        Counter plan = new Counter("plan");

        System.out.println(alert.stringCounter());
        System.out.println(add.stringCounter());
        System.out.println(good.stringCounter());
        System.out.println(plan.stringCounter());
    }
}

