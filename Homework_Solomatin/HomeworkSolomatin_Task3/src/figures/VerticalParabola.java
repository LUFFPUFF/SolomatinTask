package figures;

public class VerticalParabola {

    double x0;
    double y0;
    double a;

    public VerticalParabola(double x0, double y0, double a) {
        this.x0 = x0;
        this.y0 = y0;
        this.a = a;
    }

    public boolean isPointAboveParabola(double x, double y) {
        return y > a * Math.pow(x - x0, 2) + y0;
    }

    public boolean isPointBellowParabola(double x, double y) {
        return y < a * Math.pow(x - x0, 2) + y0;
    }

    public boolean isPointInsideParabola(double x, double y) {
        double parabolaY = a * Math.pow(x - x0, 2) + y0;
        return y <= parabolaY && isPointAboveParabola(x, y);
    }

    public boolean isPointOutsideParabola(double x, double y) {
        double parabolaY = a * Math.pow(x - x0, 2) + y0;
        return y > parabolaY || isPointBellowParabola(x, y);
    }
}
