package MangVaPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
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
            int index;
            int[] newArr = new int[size+1];
            System.out.println("Nhập vào phần tử cần thêm: ");
            x = scanner.nextInt();
            System.out.println("Nhập vị trí index cần thêm: ");
            index = scanner.nextInt();
            if (index <= -1 && index >= array.length-1) {
                    System.out.println("Không chèn được");
            } else {
                for (int j = 0; j < newArr.length; j++) {
                    if (j < index) {
                        newArr[j] = array[j];
                    } else {
                        if (j == index) {
                            newArr[j] = x;
                        } else {
                            newArr[j] = array[j-1];
                        }

                    }

                }
            }
            System.out.println("Mảng sau khi thêm phần tử " + x + " là: ");
            for (i = 0; i < newArr.length; i++) {
                System.out.print(newArr[i] + "\t");
            }
    }
}
