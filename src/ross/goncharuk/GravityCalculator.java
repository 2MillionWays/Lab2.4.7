package ross.goncharuk;

public class GravityCalculator {

    private static final double ACCELERATION = -9.81;

    public double calcDist(double t){

        int initialVelocity = 0;
        int initialPosition = 0;

        double position = 0.5*(ACCELERATION*(Math.pow(t,2)))+initialVelocity*t+initialPosition;
        return position;
    }
}
