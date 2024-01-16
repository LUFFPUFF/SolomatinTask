package figures;

public class HorizontalLine {
    double y0;
    public HorizontalLine(double y0) {
        this.y0 = y0;
    }

    public boolean isPointAboveLine(double y) {
        return y > y0;
    }

    public boolean isPointBelowLine(double y) {
        return y < y0;
    }
}
