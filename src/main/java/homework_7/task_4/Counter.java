package homework_7.task_4;

import java.util.Objects;

public class Counter {
    private String otherText;
    // ты назвала поле MAIN_TEXT, т.е. все большими буквами, такие поля должны быть объявлены как static final и идти первыми в классе
    private String MAIN_TEXT = "While major gameplay components are already in place and functioning,\n" +
            "players help is needed to add some of the smaller features and content.\n" +
            "Of course polishing the overall experience is important at the same time.\n" +
            "Game has been extensively tested in closed group, but it is always important to hear fresh suggestions\n" +
            "from larger crowd that come from various gaming backgrounds.\n" +
            "Plan is to make the game as good as possible but without compromising the core idea";
    private Integer counter;

    // молодец что попробовала сделать это в форме классе, но здесь было бы достаточно класса с методом main + 1 приватный метод,
    // с аргументом в виде виде строки для поиска или двумя аргументами String что_искать, String где_искать
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
