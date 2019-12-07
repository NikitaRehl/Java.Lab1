package rehlitskiy;

public class RightTriangles {

    private RightTriangle rightTriangles[];

    public RightTriangles(int count) {
        rightTriangles = new RightTriangle[count];
    }

    public void addRightTriangle(RightTriangle rightTriangle) { // добавление прямоугольного треугольника в массив, механика та же что и у обычных треугольников
        if (rightTriangle.isRight()) {
            for (int i = 0; i < rightTriangles.length; i++) {
                if (rightTriangles[i] == null) {
                    rightTriangles[i] = rightTriangle;
                    break;
                }
                if (i == (rightTriangles.length - 1) && rightTriangles[i] != null)
                    System.out.println("Массив прямоугольных треугольников полон!");
            }
        } else {
            System.out.println("-------------------------------------------------");
            System.out.println("Ошибка добавления прямоугольного треугольника");
        }
    }

    public void maxHypotenuse() { // вывод сведений об максимальной гипотенузе
        double currentHypotenuse, maximumHypotenuse = 0;
        for (RightTriangle rightTriangle : rightTriangles) {
            try {
                currentHypotenuse = Math.max(rightTriangle.getSide1(), Math.max(rightTriangle.getSide2(), rightTriangle.getSide3()));
                if (currentHypotenuse > maximumHypotenuse) maximumHypotenuse = currentHypotenuse;
            } catch (Exception e) {
            }
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Максимальная гипотенуза: " + maximumHypotenuse);
    }

    public void showInfo() { // вывод информации обо всех прямоугольных треугольниках
        for (int i = 0; i < rightTriangles.length; i++) {
            try {
                System.out.println("-------------------------------------------------");
                System.out.println("(" + (i + 1) + ") Прямоугольный треугольник");
                rightTriangles[i].showInfo();
            } catch (Exception e) {
                System.out.println("Пусто");
            }
        }
    }
}
