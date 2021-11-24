package Bai14_ThuatToanSapXep.TH.TH2;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " value");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("Your input list");
        for (int i = 0; i < list.length ; i++) {
            System.out.println(list[i]);
        }
        System.out.println("\nBegin sort processing...");
        bubbleSortByStep(list);
    }

    public static void bubbleSortByStep(int[] list) {
        boolean checkPass = true;

        for (int i = 1; i < list.length && checkPass; i++) {
            checkPass = false;

            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;

                    checkPass = true;
                }
            }

            if (checkPass == false) {
                System.out.println("Mang da duoc sap xep");
                break;
            }

            System.out.println("List after " + i + " sort");
            for (int j = 0; j < list.length; j++) {
                System.out.println(list[j]);
            }
            System.out.println();
        }
    }
}
