package IntroductionToJava.BaiTap;

import java.util.Scanner;

public class BaiTap3 {
    public static void main(String[] args) {
        double VND = 23000;
        double USD;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền USD: ");
        USD = scanner.nextDouble();
        double change = USD * VND;
        System.out.println("Số tiền VND là: " + change);
    }
}
