package VongLapTrongJava.ThucHanh;

import java.util.Scanner;

public class TinhTienLai {
    public static void main(String[] args) {
        int month = 1;
        double money = 1.0;
        double interestRate = 1.0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào số tiền gửi: ");
        money = sc.nextDouble();

        System.out.println("Nhập vào số tháng gửi: ");
        month = sc.nextInt();

        System.out.println("Nhập vào lãi suất: ");
        interestRate = sc.nextDouble();

        double totalInterest = 0;
        for (int i = 0; i <= month; i++) {
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Số tiền lãi là: " + totalInterest);
    }
}
