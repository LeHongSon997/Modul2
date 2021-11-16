package BT3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        NhanVien[] nhanVien = new NhanVien[2];
        nhanVien[0] = new NhanVien("Nam",1990019,"Ha Noi");
        nhanVien[1] = new NhanVien("BeDe",1990009,"Ha Noi");

        while (true) {
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Xóa nhân viên");
            System.out.println("3. Hiển thị nhân viên");
            System.out.println("4. Sửa thông tin nhân viên");
            int so = scanner.nextInt();

            switch (so) {
                case 1:
                    nhanVien = Controll.creatNhanVien(nhanVien);
                    break;
                case 2:
                    nhanVien = Controll.delete(nhanVien);
                    break;
                case 3:
                    Controll.showNhanVien(nhanVien);
                    break;
                case 4:
                    nhanVien = Controll.editNhanVien(nhanVien);
            }
        }
    }
}
