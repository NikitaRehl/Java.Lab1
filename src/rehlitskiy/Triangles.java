package rehlitskiy;

public class Triangles {

    private Triangle triangles[];

    public Triangles(int count) {
        triangles = new Triangle[count];
    }

    public void addTriangle(Triangle triangle) { // добавление треугольника в массив
        if (triangle.isExist()) { // проверяем существует ли треугольник, те что не существуют не добавляются
            for (int i = 0; i < triangles.length; i++) { // добавляем треугольник на первую попавшеюся пустую ячейку в массиве
                if (triangles[i] == null) {
                    triangles[i] = triangle;
                    break;
                }
                if (i == (triangles.length - 1) && triangles[i] != null)
                    System.out.println("Массив треугольников полон!");
            }
        } else {
            System.out.println("-------------------------------------------------");
            System.out.println("Ошибка добавления треугольника");
        }
    }

    public void getAverageArea() { // вывод средней площади треугольников
        double areaSum = 0;
        int count = 0;
        for (Triangle triangle : triangles) {
            try {
                areaSum += triangle.getAreaByGeron();
            } catch (Exception e) {
                count += 1;
            }
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Средняя площадь треугольников: " + (areaSum / (triangles.length - count)));
    }

    public void showInfo() { // вывод всех треугольников в массиве
        for (int i = 0; i < triangles.length; i++) {
            try {
                System.out.println("-------------------------------------------------");
                System.out.println("(" + (i + 1) + ") Треугольник");
                triangles[i].showInfo();
            } catch (Exception e) {
                System.out.println("Пусто");
            }

        }
    }
}