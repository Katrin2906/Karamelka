package homework_5.task_3;

abstract public class House { // public abstract... лучше так

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
    
    // лучше так
    /*
    public Boolean getHeatOn() {
        return heatOn;
    }
    
    public void setHeatOn(Boolean heatOn) {
        return this.heatOn=heatOn;
    }
    */
}
