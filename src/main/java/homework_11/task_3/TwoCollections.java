package homework_11.task_3;

import java.util.ArrayList;
import java.util.List;

public class TwoCollections {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(15);
        for (int i = 0; i < 15; i++) {
            nums.add(i);
        }
        System.out.println("First collection " + nums);
        List<Integer> otherNums = new ArrayList<>();
        for (int i = 5; i < 12; i++) {
            otherNums.add(i);
        }
        System.out.println("Other collection " + otherNums);
        nums.removeAll(otherNums);
        System.out.println("Final result " + nums);
    }
}
