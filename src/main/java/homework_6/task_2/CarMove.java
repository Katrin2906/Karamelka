package homework_6.task_2;

public class CarMove {
    private Integer Transmission; // Transmission -> transmission
    private Boolean Engine; // Engine -> engine
    private Boolean Accelerator; // Accelerator -> accelerator
    private Integer Speed; // Speed -> speed

    // здесь тоже поправь названия переменных
    public CarMove(Integer Transmission, Boolean Engine, Boolean Accelerator) {
        this.Transmission = Transmission;
        this.Engine = Engine;
        this.Accelerator = Accelerator;
    }

    public Integer SwitchAbove() {
        if (Transmission < 7 && Transmission >= 0) { // вынеси 7 и 0 в константы класса
            return (Transmission + 1);
        } else {
            return null;
        }
    }

    public Integer SwitchBelow() {
        if (Transmission <= 7 && Transmission > 0) { // вынеси 7 и 0 в константы класса
            return (Transmission - 1);
        } else {
            return null;
        }
    }

    public String Switch() {
        if (Transmission == 0) { // Transmission тип Integer, т.е. не примитив, сравниваем только через equals()
            return "Не едет, передача не переключена";
        }
        return "Передача может быть понижена до " + SwitchBelow() + " или повышена до " + SwitchAbove();
    }

    public String EngineOff() {
        if (Engine == false) { // if (Engine == false) -> if (Engine) 
            return "Заглушен, мотор уже был заглушен";
        } else {
            return "Мотор заведен";
        }
    }

    public String EngineOn() {
        if (Engine == true) { // if (Engine == false) -> if (Engine) 
            return "Мотор заведен, уже был заведен";
        } else {
            return "Мотор заглушен";
        }
    }

    public String AcceleratorPress() {
        if (Accelerator == true) { // if (Accelerator == false) -> if (Accelerator) 
            return "Педаль газа в пол!";
        } else {
            return "Не едем, педаль газа не нажата";
        }
    }

    public Integer SpeedValue() {
        if (Transmission <= 7 && Transmission >= 0) { // вынеси 7 и 0 в константы класса
            Speed = Transmission * 20; // 20 тоже в константу
            return Speed;
        } else {
            return null;
        }
    }

    public Boolean getEngine() {
        return Engine;
    }

    public Integer getTransmission() {
        return Transmission;
    }

    public Boolean getAccelerator() {
        return Accelerator;
    }

    @Override
    public String toString() {
        return "CarMove{" +
                "Transmission=" + Transmission +
                ", Engine=" + Engine +
                ", Speed=" + Speed +
                ", Accelerator=" + Accelerator +
                '}';
    }
}
