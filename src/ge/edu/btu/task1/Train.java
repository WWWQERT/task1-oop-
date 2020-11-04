package ge.edu.btu.task1;

public class Train extends Vehicle{
    private int blockingCoefficient;

    public Train(int code , Double avarageSpeed, Double distance , int blockingCoefficient )
    {
        super(code, distance,avarageSpeed );
        this.blockingCoefficient=blockingCoefficient;

    }

    public void setBlockingCoefficient(int blockingCoefficient) {
        this.blockingCoefficient = blockingCoefficient;
    }

    public int getBlockingCoefficient() {
        return blockingCoefficient;
    }


    @Override
    public  Double travelTime()
    {
        return (getDistance()/getAvarageSpeed())+blockingCoefficient;
    };
}
