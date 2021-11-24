package Bai14_ThuatToanSapXep.BT.BT1;

import java.util.Scanner;

public class InsertByStep {
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
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        System.out.println("\nBegin sort Processing");
        insertSortByStep(list);
    }

    public static void insertSortByStep(int[] list) {
        int pos, x;
        for(int i = 1; i < list.length; i++){
            boolean check = true;
            x = list[i];
            pos = i;
            while(pos > 0 && x < list[pos-1]){
                list[pos] = list[pos-1];
                pos--;
                check = false;
            }
            list[pos] = x;
            if (check) {
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
