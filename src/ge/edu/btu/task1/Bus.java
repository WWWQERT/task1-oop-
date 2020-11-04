package ge.edu.btu.task1;

public class Bus extends Vehicle{
    private int stationsNumber;
    private Double stopTime;

    public Bus(int code ,  Double avarageSpeed, Double distance , int stationsNumber, Double stopTime)
    {
        super(code, distance, avarageSpeed );
        this.stationsNumber=stationsNumber;
        this.stopTime=stopTime;
    }

    public void setStationsNumber(int stationsNumber) {
        this.stationsNumber = stationsNumber;
    }

    public int getStationsNumber() {
        return stationsNumber;
    }

    public void setStopTime(Double stopTime) {
        this.stopTime = stopTime;
    }

    public Double getStopTime() {
        return stopTime;
    }

    @Override
    public  Double travelTime()
    {
        return (getDistance()/getAvarageSpeed())+stationsNumber*stationsNumber;
    };

}
