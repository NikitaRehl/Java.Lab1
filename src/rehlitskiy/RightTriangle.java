package rehlitskiy;

public class RightTriangle extends Triangle {

    private boolean isRight = false;

    public RightTriangle(double side1, double side2, double side3) {
        super(side1, side2, side3); // содается обьект такой же как и обычный треугольник, проверяется существует ли он и так же имеет ли он прямой угол
        isRight = isRightTriangle();
    }

    public boolean isRight() {
        return isRight;
    }

    public boolean isRightTriangle() { // проверка на прямой угол
        if (super.isExist() && (super.getAngleBetweenFirstAndSecond() == 90.0 || super.getAngleBetweenSecondAndThird() == 90.0 || super.getAngleBetweenFirstAndThird() == 90.0))
            return true;
        if (getSide1() != 0 || getSide2() != 0 || getSide3() != 0) {
            System.out.println("-------------------------------------------------");
            System.out.println("Треугольник (стороны: " + getSide1() + ", " + getSide2() + ", " + getSide3() + ")" + " не имеет прямого угла");
        }
        return false;
    }

}
