package utils.helper.squares;

public class Cirlce extends BaseFigure {
    @Override
    double findSquare() {
        return 0;
    }

    public double findSquareWithRadius(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public double findSquareWithDiamiter(double diameter) {
        return 0.25 * Math.PI * Math.pow(diameter, 2);
    }
}
