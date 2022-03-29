package homework_8.task_3;

public class ArrayExeption extends Exception {

    public ArrayExeption() { // я бы использовал констуктор с аргументом String message
    }

    @Override
    public String toString() {
        return "ArrayExeption{}";
    }
}

