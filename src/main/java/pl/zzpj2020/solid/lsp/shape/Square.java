package pl.zzpj2020.solid.lsp.shape;

public class Square implements Shape {
    private double sideLength;

    @Override
    public double getPerimeter() {
        return 4.0 * sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }
}
