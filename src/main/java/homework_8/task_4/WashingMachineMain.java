package homework_8.task_4;

public class WashingMachineMain {
    public static void main(String[] args) throws ElectricityExeption {

        try {
            WashingMachine little = new WashingMachine(); // вынеси WashingMachine little выше блока try, тогда ты сможешь в блоке catch вызвать метод waterOff()
            little.workingMachine(true);
            System.out.println(little.workingMachine(true));

        } catch (ElectricityExeption e) {
            WashingMachine little = new WashingMachine(); // таким образом ты слила воду у совершенно другой машинки. Ты ведь создала новый объект класса WashingMachine
            System.out.println(little.waterOff());
            System.out.println("No electricity, water out");
        }
    }
}
