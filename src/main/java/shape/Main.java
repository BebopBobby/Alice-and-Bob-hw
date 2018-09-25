package shape;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangleOne = new Rectangle(4, 3, 8);
//        System.out.println(rectangleOne.calculateArea());

        Triangle triangleOne = new Triangle(3, 5, 3);
//        System.out.println(triangleOne.calculateArea());

        Shape[] arrayPractice = new Shape[] {triangleOne, rectangleOne};

        for (Shape q : arrayPractice) {
            System.out.println(q.calculateArea());
        }
    }
}
