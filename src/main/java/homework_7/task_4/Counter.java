package homework_7.task_4;

import java.util.Objects;

public class Counter {
    private String otherText;
    private String MAIN_TEXT = "While major gameplay components are already in place and functioning,\n" +
            "players help is needed to add some of the smaller features and content.\n" +
            "Of course polishing the overall experience is important at the same time.\n" +
            "Game has been extensively tested in closed group, but it is always important to hear fresh suggestions\n" +
            "from larger crowd that come from various gaming backgrounds.\n" +
            "Plan is to make the game as good as possible but without compromising the core idea";
    private Integer counter;

    public Counter(String otherText) {
        this.otherText = otherText;
    }

    public String StringCounter() {
        counter = 0;
        if (MAIN_TEXT.contains(otherText)) {
            counter++;
            return "Найдено совпадений " + counter;
        } else {
            return "Не найдено";
        }
    }
}