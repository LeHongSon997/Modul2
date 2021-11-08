package VongLapTrongJava.ThucHanh;

import java.util.Scanner;

public class UocSoChungLonNhat {
    public static void main(String[] args) {
        int number1;
        int number2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào số nguyên thứ nhất: ");
        number1 = sc.nextInt();

        System.out.println("Nhập vào số nguyên thứ hai: ");
        number2 = sc.nextInt();

        number1 = Math.abs(number1);
        number2 = Math.abs(number2);

        if (number1 == 0 || number2 == 0) {
            System.out.println("Không có UCLN");
        } else {
            while (number1 != number2) {
                if (number1 > number2) {
                    number1 = number1 - number2;
                } else {
                    number2 = number2 - number1;
                }
            }
        }
        System.out.println("UCLN là: " + number1);
    }
}
