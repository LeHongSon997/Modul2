package KeThua.BT.BT1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(5,"blue");
        System.out.println(circle);
        System.out.println(circle.getArea());



        CyLinder cyLinder = new CyLinder();
        System.out.println(cyLinder);

        cyLinder = new CyLinder(10);
        System.out.println(cyLinder);
        System.out.println(cyLinder.getVolume());
    }
}
