package MangVaPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class TinhTongDuongCheoMTV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
//        do {
            System.out.println("Nhập vào số dòng của ma trận: ");
            x = scanner.nextInt();
            System.out.println("Nhập vào số cột của ma trận: ");
            y = scanner.nextInt();
//        }
//        while (x != y) {
//            System.out.println("Không phải ma trận vuông!");
//
//        }

        int array[][] = new int[x][y];
        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("array[" + i + "][" + j + "] = ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Ma trận vừa nhập là: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int sum = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (i == j) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Tổng đường chéo ma trận vuông là: " + sum);
    }
}
