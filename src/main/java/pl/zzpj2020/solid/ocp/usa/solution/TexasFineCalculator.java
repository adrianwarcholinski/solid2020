package pl.zzpj2020.solid.ocp.usa.solution;

public class TexasFineCalculator implements FineCalculator {
    @Override
    public double calculateFine(int allowedSpeed, int actualSpeed) {
        int difference = allowedSpeed - actualSpeed;
        if (difference > 0) {
            return difference + 600;
        }
        return 0.0;
    }
}
