package homework_9.task_4;

import java.io.Serializable;

public class Work implements Serializable {
    private String position;
    private Integer minWorkExperience;

    public Work(String position, Integer minWorkExperience) {
        this.position = position;
        this.minWorkExperience = minWorkExperience;
    }

    public String getPosition() {
        return position;
    }

    public Integer getMinWorkExperience() {
        return minWorkExperience;
    }

    @Override
    public String toString() {
        return "Work{" +
                "position='" + position + '\'' +
                ", minWorkExperience=" + minWorkExperience +
                '}';
    }
}
