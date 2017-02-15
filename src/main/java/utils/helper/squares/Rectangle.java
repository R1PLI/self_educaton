package utils.helper.squares;

public class Rectangle extends BaseFigure {
    @Override
    double findSquare() {
        return 0;
    }

    public int findSquare(int firstSide, int secondSide) {
        return firstSide*secondSide;
    }
}
