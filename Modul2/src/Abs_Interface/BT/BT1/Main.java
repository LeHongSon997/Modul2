package Abs_Interface.BT.BT1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        circle = new Circle();
        circle.setRadius(5.9);
        System.out.println(circle.Resizeable());



        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setLength(5);
        System.out.println(rectangle.Resizeable());


        Square shape = new Square();
        System.out.println(shape);

        shape = new Square("red", false);
        System.out.println(shape);
    }
}
