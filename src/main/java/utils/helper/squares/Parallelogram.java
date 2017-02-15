package utils.helper.squares;

public class Parallelogram extends BaseFigure {

    @Override
    double findSquare() {
        return 0;
    }

    public double findSquare(double firstSide, double height) {
        return firstSide * height;
    }

    public double findSquareUsingSides(double firstSide, double secondSide, double angleBetweenSides) {
        double sin = Math.sin(angleBetweenSides);

        return firstSide * secondSide * sin;
    }

    public double findSquareUsingDiagonals(double firstSide, double secondSide, double angleBetweenDiagonals) {
        double sin = Math.sin(angleBetweenDiagonals);

        return 0.5 * firstSide * secondSide * sin;
    }
}
