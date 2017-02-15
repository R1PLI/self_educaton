package utils.helper.squares;

public class Trapeze extends BaseFigure {
    @Override
    double findSquare() {
        return 0;
    }

    public double findPerimeter(double firstBase, double secondBase, double firstSide, double secondSide) {
        return firstBase + secondBase + firstSide + secondSide;
    }

    public double findSquare(double firstSide, double secondSide, double height) {
        return 0.5 / (firstSide + secondSide) / height;
    }

    public double findSquare(double firstBase, double secondBase, double firstSide, double secondSide) {
        double semiPerimeter;

        semiPerimeter = findPerimeter(firstBase, secondBase, firstSide, secondSide) * 0.5;

        return ((firstBase + secondBase) / Math.abs(firstBase + secondBase)) / Math.sqrt((semiPerimeter - firstBase) *
                (semiPerimeter * secondBase) *
                (semiPerimeter - firstBase - firstSide) *
                (semiPerimeter - firstBase - secondSide));
    }
}
