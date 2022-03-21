package homework_6.task_2;

public class CarMove {
    private Integer Transmission;
    private Boolean Engine;
    private Boolean Accelerator;
    private Integer Speed;

    public CarMove(Integer Transmission, Boolean Engine, Boolean Accelerator) {
        this.Transmission = Transmission;
        this.Engine = Engine;
        this.Accelerator = Accelerator;
    }

    public Integer SwitchAbove() {
        if (Transmission < 7 && Transmission >= 0) {
            return (Transmission + 1);
        } else {
            return null;
        }
    }

    public Integer SwitchBelow() {
        if (Transmission <= 7 && Transmission > 0) {
            return (Transmission - 1);
        } else {
            return null;
        }
    }

    public String Switch() {
        if (Transmission == 0) {
            return "Не едет, передача не переключена";
        }
        return "Передача может быть понижена до " + SwitchBelow() + " или повышена до " + SwitchAbove();
    }

    public String EngineOff() {
        if (Engine == false) {
            return "Заглушен, мотор уже был заглушен";
        } else {
            return "Мотор заведен";
        }
    }

    public String EngineOn() {
        if (Engine == true) {
            return "Мотор заведен, уже был заведен";
        } else {
            return "Мотор заглушен";
        }
    }

    public String AcceleratorPress() {
        if (Accelerator == true) {
            return "Педаль газа в пол!";
        } else {
            return "Не едем, педаль газа не нажата";
        }
    }

    public Integer SpeedValue() {
        if (Transmission <= 7 && Transmission >= 0) {
            Speed = Transmission * 20;
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
