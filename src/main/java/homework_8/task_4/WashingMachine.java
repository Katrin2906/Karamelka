package homework_8.task_4;

public class WashingMachine {

    private Boolean electricity;
    private String washingMachine;

    public WashingMachine() {
        this.washingMachine = "Заря";
    }

    /*
    по идее электричество должно само пропадавать внезапно. Внутри метода можно сделать цикл и вызывать random.nextBoolean() как триггер
    ну и если вылетает исключение то машинка сама запускает метод слива воды в блоке catch или в finally, здесь он тоже хорошо подойдет
    
    Random random = new Random();
    random.nextBoolean();
        */
    public String workingMachine(Boolean electricity) throws ElectricityExeption {
        if(electricity){
            return "working, electricity on";
        }else {
            throw new ElectricityExeption("No electricity, water out");
        }
    }

    // этот метод можно сделать приватным, т.к. он вызывается автоматически
    public String waterOff(){
        return "water off";
    }

    public String getWashingMachine() {
        return washingMachine;
    }
}
