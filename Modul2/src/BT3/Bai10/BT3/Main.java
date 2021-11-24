package BT3.Bai10.BT3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       QuanLyNguoi hocVien = new QuanLyNguoi();
       while (true){
           System.out.println("1: Thêm học viên");
           System.out.println("2: Show");
           System.out.println("3: Search");
           System.out.println("4: Delete");
           System.out.println("5: Sum");
           System.out.println("6: Edit");
           int so = Integer.parseInt(scanner.nextLine());

           switch (so) {
               case 1:
                   hocVien.add();
                   break;
               case 2:
                   hocVien.show();
                   break;
               case 3:
                   hocVien.search();
                   break;
               case 4:
                   hocVien.delete();
                   break;
               case 5:
                   hocVien.sum();
                   break;
               case 6:
                   hocVien.edit();
                   break;
               case 7:
                   hocVien.sort();
                   break;
           }
       }
    }
}
