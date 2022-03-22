package homework_6.task_1;

public class RecursionCycleMain {
    public static void main(String[] args) {
        RecursionCycle recursion = new RecursionCycle(6); // у тебя цифра 6 фигурирует 3 раза. Вынеси в отдельную переменную

        int x; // а зачем отдельно выносить переменную? создай ее в цикле 
        for (x = 0; x < 6; x++) {
            recursion.cycle[x] = x;
        }
        recursion.printCycle(6);
    }
}

// лучше делай классы в отдельном файле
class RecursionCycle {

    int cycle[];

    RecursionCycle(int i) {
        cycle = new int[i];
    }

    void printCycle(int i) {
        if (i == 0) {
            return;
        } else {
            printCycle(i - 1); // i - 1 повторяется 3 раза, выноси повторения в переменную
            System.out.println("Array element [" + (i - 1) + "] " + cycle[i - 1]);
        }
    }
    // сложный метод получился, думаю можно так
    /*
    void printCycle(int i) {
        if (i == 0) {
            return;
        } 
        printCycle(i - 1);
        System.out.println("Array element [" + (i - 1) + "] " + cycle[i - 1]);
    }
    */
}

