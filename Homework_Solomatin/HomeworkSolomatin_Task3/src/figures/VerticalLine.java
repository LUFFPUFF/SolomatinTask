package figures;

public class VerticalLine {
    private final double x0;

    public VerticalLine(double x0) {
        this.x0 = x0;
    }

    public boolean isPointRightOfLine(double x) {
        return x > x0;
    }

    public boolean isPointLeftOfLine(double x) {
        return x < x0;
    }
}
