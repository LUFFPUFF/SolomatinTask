package figures;

public class Circle {
    double x0;
    double y0;
    double r;

    public Circle(double x0, double y0, double r) {
        this.x0 = x0;
        this.y0 = y0;
        this.r = r;
    }

    public boolean isPointInsideCircle(double x, double y) {
        return Math.pow(x - x0, 2) + Math.pow(y - y0, 2) < Math.pow(r, 2);
    }

    public boolean isPointOutsideCircle(double x, double y) {
        return Math.pow(x - x0, 2) + Math.pow(y - y0, 2) > Math.pow(r, 2);
    }
}
