package homework_5.task_3;

abstract public class House {

    private Integer floorNumber;
    private Integer residentNumber;
    private Boolean heatOn;

    public House(Integer floorNumber, Integer residentNumber, Boolean heatOn) {
        this.floorNumber = floorNumber;
        this.residentNumber = residentNumber;
        this.heatOn = true;
    }

    public Integer getFloorNumber() {
        return floorNumber;
    }

    public Integer getResidentNumber() {
        return residentNumber;
    }

    public Boolean heatOn() {
        return heatOn = true;
    }
}
