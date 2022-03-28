package homework_8.task_4;

public class WashingMachineMain {
    public static void main(String[] args) throws ElectricityExeption {

        try {
            WashingMachine little = new WashingMachine();
            little.workingMachine(true);
            System.out.println(little.workingMachine(true));

        } catch (ElectricityExeption e) {
            WashingMachine little = new WashingMachine();
            System.out.println(little.waterOff());
            System.out.println("No electricity, water out");
        }
    }
}