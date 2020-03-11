package pl.zzpj2020.solid.ocp.usa.solution;

public class SpeedLimitLaw {
    private int maxSpeed;

    public SpeedLimitLaw(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double calculateFine(FineCalculator calculator, int speed) {
        if (speed > maxSpeed) {
            return calculator.calculateFine(maxSpeed, speed);
        }

        return 0.0;
    }
}
