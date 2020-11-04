package ge.edu.btu.task1;

public abstract class Vehicle {
    private int code;
    private Double distance;
    private Double avarageSpeed;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getAvarageSpeed() {
        return avarageSpeed;
    }

    public void setAvarageSpeed(Double avarageSpeed) {
        this.avarageSpeed = avarageSpeed;
    }

    public void Vehicle(){};

    public Vehicle(int code , Double distance, Double avarageSpeed )
    {
        this.avarageSpeed=avarageSpeed;
        this.code=code;
        this.distance=distance;
    }


    public abstract Double travelTime();



}
