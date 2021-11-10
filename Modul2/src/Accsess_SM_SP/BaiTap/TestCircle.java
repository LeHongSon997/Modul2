package Accsess_SM_SP.BaiTap;

import Accsess_SM_SP.BaiTap.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Circle circle1 = new Circle();
        System.out.println(circle.getRadius());
        System.out.println(circle1.getArea());

    }
}
