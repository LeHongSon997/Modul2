package MangVaPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class TimGTNN {
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
        int min = array[0];
        for (int j = 1; j < array.length; j++) {
            if (min > array[j]) {
                min = array[j];
            }
        }
        System.out.println("Giá trị nhỏ nhất là: " + min);
    }
}
