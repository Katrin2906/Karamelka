package homework_8.task_4;

public class WashingMachine {

    private Boolean electricity;
    private String washingMachine;

    public WashingMachine() {
        this.washingMachine = "Заря";
    }

    public String workingMachine(Boolean electricity) throws ElectricityExeption {
        if(electricity){
            return "working, electricity on";
        }else {
            throw new ElectricityExeption("No electricity, water out");
        }
    }

    public String waterOff(){
        return "water off";
    }

    public String getWashingMachine() {
        return washingMachine;
    }
}
