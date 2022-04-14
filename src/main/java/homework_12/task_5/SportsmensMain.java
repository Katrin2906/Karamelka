package homework_12.task_5;

import homework_11.task_9.Student;

import java.util.*;

public class SportsmensMain {
    public static void main(String[] args) {
        List<Sportsmen> run = new ArrayList<>();
        run.add(new Sportsmen("Bill", 12, new Map<Integer, String>));
        run.add(new Sportsmen("Dave", 15, new Map<Integer, String>()));
        run.add(new Sportsmen("Tom", 12, new Map<Integer, String>()));

        Comparator<Sportsmen> sportsmenComparator = SpeedComparator.thenComparing(Sportsmen::getSpeed);
        List<Sportsmen> sportsmen = new ArrayList<>(sportsmenComparator);

    }//не сообразила до конца, как действовать дальше
}
