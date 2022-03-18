package homework_5.task_3;

public class TownHouse extends House {

    public TownHouse(Integer floorNumber, Integer residentNumber, Boolean heatOn) {
        super(floorNumber, residentNumber, heatOn);
    }

    @Override // если ты никак не меняешь поведение метода, то зачем его переопределять, отсюда можно удалить, а работать все будет как и прежде
    public Integer getFloorNumber() {
        return super.getFloorNumber();
    }

    @Override // если ты никак не меняешь поведение метода, то зачем его переопределять, отсюда можно удалить, а работать все будет как и прежде
    public Integer getResidentNumber() {
        return super.getResidentNumber();
    }

    @Override // если ты никак не меняешь поведение метода, то зачем его переопределять, отсюда можно удалить, а работать все будет как и прежде
    public Boolean heatOn() {
        return super.heatOn();
    }
}
