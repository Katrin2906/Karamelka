package homework_7.task_4;

public class Counter {
    private String otherText;
    private static final String MAIN_TEXT = "While major gameplay components are already in place and functioning,\n" +
            "players help is needed to add some of the smaller features and content.\n" +
            "Of course polishing the overall experience is important at the same time.\n" +
            "Game has been extensively tested in closed group, but good it is always important to hear fresh suggestions\n" +
            "from larger crowd that come from various gaming backgrounds.\n" +
            "Plan is to make the game as good as possible but without compromising the core idea";
    private Integer counter;

    // молодец что попробовала сделать это в форме классе, но здесь было бы достаточно класса с методом main + 1 приватный метод,
    // с аргументом в виде виде строки для поиска или двумя аргументами String что_искать, String где_искать
    public Counter(String otherText) {
        this.otherText = otherText;
    }

    // я заметил что плохо подобрал текст, поэтому ты тоже скорее всего не заметила проблему
    // суть в том, что твой метод будет возвращать 0, если ничего не найдет и 1, если найдет 1 повтор. Но ведь повторений может быть гораздо больше
    // тебе нужен был метод lastIndexOf(String str, int fromIndex), он возвращает -1, если ничего не найдено, или индекс где находится строка.
    // Таким образом ты сможешь узнавать индекс и говорить программе с какого момента начинать искать следующий повтор
    public String stringCounter() {
        counter = 0;
        if (MAIN_TEXT.contains(otherText)) {
            counter++;
            return "Найдено совпадений " + counter;
        } else {
            return "Не найдено";
        }
    }
}
