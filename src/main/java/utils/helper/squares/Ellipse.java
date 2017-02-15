package utils.helper.squares;

public class Ellipse extends BaseFigure {
    @Override
    double findSquare() {
        return 0;
    }

    public double findSquare(double smallAxle, double bigAxle) {
        return smallAxle * bigAxle * Math.PI;
    }
}
