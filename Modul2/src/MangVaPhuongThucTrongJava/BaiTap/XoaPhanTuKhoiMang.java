package MangVaPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a N:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Mảng array là: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println();
        int x;
        int c = 0;
        System.out.println("Nhập phần tử cần xóa: ");
        x = scanner.nextInt();
        for (i = 0; i < size; i++) {
            if (array[i] != x) {
                array[c] = array[i];
                c++;
            }
        }

        size = c;
        System.out.println("Mảng còn lại sau khi xóa phần tử " + x + " là: ");
        for (i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
