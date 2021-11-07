package VongLapTrongJava;

import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        int count = 1;
        int i = 2;

        while (count <= 20) {
            int j = 2;
            boolean check = true;
            while (j <= i / 2) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
                j++;
            }
            if (check) {
                System.out.println(i);
                if (count == 20) {
                    break;
                }
                count++;
            }
            i++;
        }
    }
}
