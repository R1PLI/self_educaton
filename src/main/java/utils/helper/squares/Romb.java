package utils.helper.squares;

public class Romb extends BaseFigure {

    @Override
    double findSquare() {
        return 0;
    }

    public double findSquares(double side, double height) {
        return side * height;
    }

    public double findSquaresUsingAngle(double side, double angleBetweenSides) {
        return Math.pow(side, 2) * angleBetweenSides;
    }

    public double findSquaresUsingDiagonales(double firstDiagonal, double secondDiagonal) {
        return 0.5 * firstDiagonal * secondDiagonal;
    }
}
