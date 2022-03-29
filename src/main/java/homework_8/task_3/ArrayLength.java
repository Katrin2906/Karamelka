package homework_8.task_3;

public class ArrayLength {

    private static final Integer MAX_VALUE = 20;
    private Integer arrayLength;

// лишняя строка
    public ArrayLength() {
    }

    public Integer find(Integer arrayLength) throws ArrayExeption { // find - твой метод ничего не ищет, это скорее checkLength или validate
        if (arrayLength >= 0 && arrayLength <= MAX_VALUE) {
            return arrayLength;
        } else {
            throw new ArrayExeption();
        }
    }
}
