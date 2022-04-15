package homework_12.task_5;

import homework_11.task_9.Student;

import java.util.Comparator;

// +
public class SpeedComparator implements Comparator<Sportsmen> {
    @Override
    public int compare(Sportsmen o1, Sportsmen o2) {
        return o1.getSpeed().compareTo(o2.getSpeed());
    }
}

