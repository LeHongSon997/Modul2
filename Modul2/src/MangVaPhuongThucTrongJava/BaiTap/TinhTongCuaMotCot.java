package MangVaPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class TinhTongCuaMotCot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int[][] array = {
//                {5,2,1,5},
//                {4,1,6,7}
//        };
        int x;
        int y;
        System.out.println("Nhập vào số dòng của ma trận: ");
        x = scanner.nextInt();
        System.out.println("Nhập vào số cột của ma trận: ");
        y = scanner.nextInt();

        int array[][] = new int[x][y];
        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("array[" + i + "][" + j + "] = ");
                array[i][j] = scanner.nextInt();
            }
        }
        int column;
        System.out.println("Nhập vào cột cần tính tổng: ");
        column = scanner.nextInt();
            int total = 0;
            for (int row = 0; row < array.length; row++) {
                total += array[row][column];
            }
        System.out.println("Tổng của cột " + column + " là: " + total);
    }
}
