package homework_6.task_2;

public class CarMoveMain {
    public static void main(String[] args) {
        CarMove car = new CarMove(0, false, true);

        if (car.getTransmission() < 0 || car.getTransmission() > 7) {
            System.out.println("C передачей что-то не то...Опять сломалась?");
        }

        if (car.getTransmission() < 1 || car.getTransmission() > 7 || car.getEngine() == false || car.getAccelerator() == false) {
            System.out.println("Не поедем ((");
        } else {
            System.out.println("Поехали! " + " Скорость машины " + car.SpeedValue());
        }

        if (car.getTransmission() > 1 && car.getTransmission() <= 7 && car.getEngine() == true && car.getAccelerator() == true) {
            System.out.println("Уже в пути! " + " Скорость машины " + car.SpeedValue());
        } else {
            System.out.println("Опять не едем ((");
        }

        System.out.println(car.EngineOff());
        System.out.println(car.EngineOn());
        System.out.println(car.AcceleratorPress());
        System.out.println(car.Switch());
    }
}
