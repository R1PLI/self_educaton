package utils.helper.squares;

public class Square extends BaseFigure {

    @Override
    double findSquare() {
        return 0;
    }



    public double findSquare(int firstSide) {
        return (int) Math.pow(firstSide, 2);
    }

    public double findSquare(double diagonal) {
        return 0.5 * Math.pow(diagonal, 2);
    }
}
