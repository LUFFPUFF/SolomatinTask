package figures;

public class HorizontalParabola {

    private final double x0;
    private final double y0;
    private final double a;
    public HorizontalParabola(double x0, double y0, double a) {
        this.x0 = x0;
        this.y0 = y0;
        this.a = a;
    }

    public boolean isPointRightOfParabola(double x, double y) {
        return x > a * Math.pow(y - y0, 2) + x0;
    }

    public boolean isPointLeftOfParabola(double x, double y) {
        return x < a * Math.pow(y - y0, 2) + x0;
    }

    public boolean isPointInsideParabola(double x, double y) {
        double parabolaX = a * Math.pow(y - y0, 2) + x0;
        return x >= parabolaX && isPointLeftOfParabola(x, y);
    }

    public boolean isPointOutsideParabola(double x, double y) {
        double parabolaX = a * Math.pow(y - y0, 2) + x0;
        return x < parabolaX || isPointRightOfParabola(x, y);
    }
}
