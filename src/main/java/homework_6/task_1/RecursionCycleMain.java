package homework_6.task_1;

public class RecursionCycleMain {
    public static void main(String[] args) {
        RecursionCycle recursion = new RecursionCycle(6);

        int x;
        for (x = 0; x < 6; x++) {
            recursion.cycle[x] = x;
        }
        recursion.printCycle(6);
    }
}

class RecursionCycle {

    int cycle[];

    RecursionCycle(int i) {
        cycle = new int[i];
    }

    void printCycle(int i) {
        if (i == 0) {
            return;
        } else {
            printCycle(i - 1);
            System.out.println("Array element [" + (i - 1) + "] " + cycle[i - 1]);
        }
    }
}

