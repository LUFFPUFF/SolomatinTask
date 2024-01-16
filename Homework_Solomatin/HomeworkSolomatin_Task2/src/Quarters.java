public class Quarters {
    public static void main(String[] args) {

        int x1 = -1, y1 = -1;
        int x2 = -1, y2 = 5;
        int x3 = 5, y3 = -1;

        getQuarters(x1, y1, x2, y2, x3, y3);
    }

    public static void getQuarters(int X1, int Y1, int X2, int Y2, int X3, int Y3) {

        boolean quadrant1 = isPointInQuadrant(X1, Y1, 1) || isPointInQuadrant(X2, Y2, 1) ||
                isPointInQuadrant(X3, Y3, 1);
        boolean quadrant2 = isPointInQuadrant(X1, Y1, 2) || isPointInQuadrant(X2, Y2, 2) ||
                isPointInQuadrant(X3, Y3, 2);
        boolean quadrant3 = isPointInQuadrant(X1, Y1, 3) || isPointInQuadrant(X2, Y2, 3) ||
                isPointInQuadrant(X3, Y3, 3);
        boolean quadrant4 = isPointInQuadrant(X1, Y1, 4) || isPointInQuadrant(X2, Y2, 4) ||
                isPointInQuadrant(X3, Y3, 4);

        boolean crossesXAxis = (Y1 > 0 && Y2 < 0) || (Y2 > 0 && Y3 < 0) || (Y3 > 0 && Y1 < 0);
        boolean crossesYAxis = (X1 > 0 && X2 < 0) || (X2 > 0 && X3 < 0) || (X3 > 0 && X1 < 0);

        if (crossesXAxis) {
            quadrant1 = quadrant1 || quadrant4;
            quadrant2 = quadrant2 || quadrant3;
        }

        if (crossesYAxis) {
            quadrant1 = quadrant1 || quadrant2;
            quadrant3 = quadrant3 || quadrant4;
        }

        if (quadrant1) System.out.print("1, ");
        if (quadrant2) System.out.print("2, ");
        if (quadrant3) System.out.print("3, ");
        if (quadrant4) System.out.print("4 ");
    }

    public static boolean isPointInQuadrant(int x, int y, int quadrant) {
        return switch (quadrant) {
            case 1 -> x > 0 && y > 0;
            case 2 -> x < 0 && y > 0;
            case 3 -> x < 0 && y < 0;
            case 4 -> x > 0 && y < 0;
            default -> false;
        };
    }
}
