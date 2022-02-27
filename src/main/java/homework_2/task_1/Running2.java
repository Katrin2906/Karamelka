package homework_2.task_1;

public class Running2 {
    public static void main(String[] args) {
        int days = 1;
        double l = 10; // эту переменную тоже стоит переименовать
        double sum = 0;
        do {
            System.out.println("Расстояние за " + days + " день " + l + " км");
            days = days + 1;
            l = l + l / 10; // 10 это так называемое "магическое число", т.е. непонятно что это. Вынеси тоже в отдельную переменную
            sum = sum + l;
        } while (days <= 7);
        
        System.out.println("Общее расстояние " + (sum - 10) + "км");
        // (sum - 10) - выглядит странно. Я понимаю почему ты так сделала, но так делать не стоит. Измени программу так, чтобы было просто
        // System.out.println("Общее расстояние " + sum + "км"); т.е. без -10
        
    }
}
