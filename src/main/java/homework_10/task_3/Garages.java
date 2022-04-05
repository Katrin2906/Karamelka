package homework_10.task_3;

// Тип Т - это марка будущего автомобиля, который будет хранится в гараже. Ниже положил тебе пример как мог выглядеть твой код
public class Garages<T> {

    private T auto;
    private T BMW;
    private T Lada;
    private T name;

    Garages(T name) {
        this.name = name;
    }

    public T getAuto() {
        return auto;
    }

    public T getBMW() {
        return BMW;
    }

    public T getLada() {
        return Lada;
    }

    public String compareBMW(Garages auto, Garages auto1) {
        if (!(auto.getAuto().equals(getBMW()))) {
            return "В общий";
        } else return " ВMW";
    }

    public String compareLada(Garages auto, Garages auto1) {
        if (!(auto.getAuto().equals(getLada()))) {
            return "В общий";
        } else return " Lada";
    }

}

// Example
record Garage<T>(T[] cars) {

     public void replaceFirst(T car) {
         cars[0] = car;
     }
}

record Bmw(String name) {

}

record Lada(String name) {

}
