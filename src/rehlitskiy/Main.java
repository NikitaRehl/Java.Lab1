package rehlitskiy;

public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        Triangle triangle1 = new Triangle(12, 5, 8);
        Triangle triangle2 = new Triangle(13, 15 ,23);
        Triangle triangle3 = new Triangle(4, 2 ,3);
        Triangle triangle4 = new Triangle(4, 3 ,6);

        Triangles triangles = new Triangles(6);
        triangles.addTriangle(triangle);
        triangles.addTriangle(triangle1);
        triangles.addTriangle(triangle2);
        triangles.addTriangle(triangle3);
        triangles.addTriangle(triangle4);

        triangles.showInfo();
        triangles.getAverageArea();

        RightTriangle rightTriangle = new RightTriangle(3, 4, 5);
        RightTriangle rightTriangle1 = new RightTriangle(4, 4, 4);
        RightTriangle rightTriangle2 = new RightTriangle(3, 6, 9);
        RightTriangle rightTriangle3 = new RightTriangle(1, 5, 5);
        RightTriangle rightTriangle4 = new RightTriangle(3, 4, 5);

        RightTriangles rightTriangles = new RightTriangles(6);

        rightTriangles.addRightTriangle(rightTriangle);
        rightTriangles.addRightTriangle(rightTriangle1);
        rightTriangles.addRightTriangle(rightTriangle2);
        rightTriangles.addRightTriangle(rightTriangle3);
        rightTriangles.addRightTriangle(rightTriangle4);

        rightTriangles.showInfo();
        rightTriangles.maxHypotenuse();

    }
}
