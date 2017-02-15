package utils.helper.squares;


public class Triangle extends BaseFigure {

    @Override
    double findSquare() {
        return 0;
    }

    public double findPerimeter(double firstSide, double secondSide, double thirdSide) {
        return firstSide + secondSide + thirdSide;
    }

    public double findSquare(double side, double height) {
        return 0.5 * side * height;
    }

    public double findSqaure(double firstSide, double secondSide, double thirdSide) {

        double perimeter;
        perimeter = findPerimeter(firstSide, secondSide, thirdSide) / 2;

        return Math.sqrt(perimeter * (perimeter - firstSide) * (perimeter - secondSide) * (perimeter - thirdSide));
    }

    public double findSquare(double firstSide, double secondSide, double angleBetweenFirstAndSecondSide) {
        double sin = Math.sin(angleBetweenFirstAndSecondSide);

        return 0.5 * firstSide * secondSide * sin;
    }

    public double findSquare(double firstSide, double secondSide, double thirdSide, double radius, String typeOfRadius) {
        double square;

        if (radius == 0) {
            throw new IllegalArgumentException("Dividing by zero");
        } else {
            switch (typeOfRadius) {
                case "circumcircle":
                    square = (firstSide * secondSide * thirdSide) / radius;
                    break;
                case "incircle":
                    square = findPerimeter(firstSide, secondSide, thirdSide) / 2 / radius;
                    break;
                default:
                    square = 0;
            }
            return square;
        }
    }
}
