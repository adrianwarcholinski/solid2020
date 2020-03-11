package pl.zzpj2020.solid.ocp.usa.solution;

public class WashingtonFineCalculator implements FineCalculator {
    @Override
    public double calculateFine(int allowedSpeed, int actualSpeed) {
        int difference = allowedSpeed - actualSpeed;
        if (difference > 0) {
            return difference * 20;
        }
        return 0.0;
    }
}
