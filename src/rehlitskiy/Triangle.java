package rehlitskiy;

public class Triangle {

    private double side1, side2, side3;
    private boolean isExist = false;

    public Triangle(double side1, double side2, double side3) {
        if (isDataRight() && checkIsExist(side1, side2, side3)) { // проверка на правильность ввода данных и существования треугольника
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
            this.isExist = true;
        } else {
            System.out.println("-------------------------------------------------");
            System.out.println("Треугольник (стороны: " + side1 + ", " + side2 + ", " + side3 + ")" + " не может существовать");
        }
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) { // установка значения стороны
        if (checkIsExist(side1, this.side2, this.side3)) // проверка может ли существовать треугольник с введеной стороной, если нет, то ничего не меняется
            this.side1 = side1;
        else {
            System.out.println("-------------------------------------------------");
            System.out.println("Треугольник с такой стороной не может существовать");
        }
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        if (checkIsExist(this.side1, side2, this.side3))
            this.side2 = side2;
        else {
            System.out.println("-------------------------------------------------");
            System.out.println("Треугольник с такой стороной не может существовать");
        }
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        if (checkIsExist(this.side1, this.side2, side3))
            this.side3 = side3;
        else {
            System.out.println("-------------------------------------------------");
            System.out.println("Треугольник с такой стороной не может существовать");
        }
    }

    public boolean isDataRight() { // проверка на не отрицательные стороны
        if (getSide1() > 0 || getSide2() > 0 || getSide3() > 0)
            return false;
        return true;
    }

    public boolean isExist() {
        return isExist;
    }

    public boolean checkIsExist(double side1, double side2, double side3) { // проверка на существование треугольника с введенными сторонами
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1)
            return true;
        return false;
    }

    public double getPerimeter() { // выщитывает периметр треугольника
        return this.side1 + this.side2 + this.side3;
    }

    public double getAreaByGeron() { // выщитывает площадь треугольника по формуле Герона
        double p = (this.side1 + this.side2 + this.side3) / 2.0;
        return Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
    }

    public double calculateAngle(double side1, double side2, double side3) { // выщитывает угол между первыми двумя введенными сторонами в радианах
        return Math.acos((Math.pow(side1, 2) + Math.pow(side2, 2) - Math.pow(side3, 2)) / (2 * side1 * side2));
    }

    public double getAngleBetweenFirstAndSecond() { // то же что и предыдущее, только возвращает в градусах
        return Math.toDegrees(calculateAngle(this.side1, this.side2, this.side3));
    }

    public double getAngleBetweenSecondAndThird() {
        return Math.toDegrees(calculateAngle(this.side2, this.side3, this.side1));
    }

    public double getAngleBetweenFirstAndThird() {
        return Math.toDegrees(calculateAngle(this.side1, this.side3, this.side2));
    }

    public void showInfo() { // вывод информации треугольника
        if (isExist) { // проверка существует ли треугольник
            System.out.println("Сторона 1: " + side1
                    + "\nСторона 2: " + side2
                    + "\nСторона 3: " + side3
                    + "\nПериметр треугольника: " + getPerimeter()
                    + "\nПлощадь треугольника: " + getAreaByGeron()
                    + "\nУгол между первой и второй стороной: " + getAngleBetweenFirstAndSecond()
                    + "\nУгол между второй и третьей стороной: " + getAngleBetweenSecondAndThird()
                    + "\nУгол между первой и третьей стороной: " + getAngleBetweenFirstAndThird());
        }
    }
}
