package LopVaDoiTuongTrongJava;

import java.util.Scanner;

public class QuadraticEquation {
    double a,b,c;

    public QuadraticEquation(double a,double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {return (b)*(b) - (4 * a * c);}

    public double getRoot1() {return ((-b + Math.pow(getDiscriminant(),0.5)) / 2 * a) ;}

    public double getRoot2() {return ((-b - Math.pow(getDiscriminant(),0.5)) / 2 * a) ;}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập vào b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập vào c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant() >= 0) {
            System.out.println("Phương trình có 2 nghiệm: " + " x1: " + quadraticEquation.getRoot1() + " x2: " + quadraticEquation.getRoot2() );
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("Phương trình có một nghiệm: " + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
