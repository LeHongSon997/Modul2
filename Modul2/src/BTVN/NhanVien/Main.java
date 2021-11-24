package BTVN.NhanVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        NhanVien[] nhanViens = new NhanVien[3];
        nhanViens[0] = new NhanVien("Mikami", 23, "nu");
        nhanViens[1] = new NhanVien("Fukura", 23, "nu");
        nhanViens[2] = new NhanVien("Emi", 23, "nu");

        while (true) {
            System.out.println("1. Hiển thị nhân viên");
            System.out.println("2. thêm nhân viên");
            System.out.println("3. xóa nhân viên");
            System.out.println("4. Sửa thông tin nhân viên");
            int so = scanner.nextInt();

            switch (so) {
                case 1:
                    Contructor.show(nhanViens);
                    break;
                case 2:
                    nhanViens = Contructor.createNhanVien(nhanViens);
                    break;
                case 3:
                    nhanViens = Contructor.delete(nhanViens);
                    break;
                case 4:
                    nhanViens = Contructor.editNhanVien(nhanViens);
            }
        }
    }
}
