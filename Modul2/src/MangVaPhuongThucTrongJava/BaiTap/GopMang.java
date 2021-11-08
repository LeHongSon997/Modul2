package MangVaPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[5];
        int[] arr2 = new int[4];
        int i = 0;
        int j = 0;
        while (i < arr1.length) {
            System.out.print("Enter element of arr1 " + (i + 1) + ": ");
            arr1[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Mảng 1 là: ");
        for (i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
        System.out.println();
        while (j < arr2.length) {
            System.out.print("Enter element of arr2 " + (j + 1) + ": ");
            arr2[j] = scanner.nextInt();
            j++;
        }
        System.out.println("Mảng 2 là: ");
        for (i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "\t");
        }
        System.out.println();
        int c = 0;
        int[] arr3 = new int[9];
        for (int k = 0; k < arr1.length; k++) {
            arr3[c] = arr1[k];
            c++;
        }
        for (int k = 0; k < arr2.length; k++) {
            arr3[c] = arr2[k];
            c++;
        }
        System.out.println("Mảng 3 là: ");
        for (i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + "\t");
        }
    }
}
