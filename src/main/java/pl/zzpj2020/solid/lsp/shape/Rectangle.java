package pl.zzpj2020.solid.lsp.shape;

public class Rectangle implements Shape {
    private double width;
    private double height;

    @Override
    public double getPerimeter() {
        return 2.0 * (width + height);
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
