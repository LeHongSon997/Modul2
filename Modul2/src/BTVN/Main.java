package BTVN;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        NhanVien[] nhanViens = new NhanVien[3];
        nhanViens[0] = new NhanVien("Toàn", 23, "nam");
        nhanViens[1] = new NhanVien("Nam", 23, "nam");
        nhanViens[2] = new NhanVien("Tùng", 23, "nam");

        while (true) {
            System.out.println("1. Hiển thị nhân viên");
            System.out.println("2. thêm nhân viên");
            System.out.println("3. xóa nhân viên");
            int so = scanner.nextInt();

            switch (so) {
                case 1:
                    show(nhanViens);
                    break;
                case 2:
                    nhanViens = createNhanVien(nhanViens);
                    break;
                case 3:
                    nhanViens = delete(nhanViens);
                    break;
            }
        }
    }

    public static void show(NhanVien[] nhanViens) {
        for (NhanVien nv : nhanViens) {
            System.out.println(nv.toString());
        }
    }

    public static NhanVien[] createNhanVien(NhanVien[] nhanViens) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập name");
        String name = scanner.nextLine();
        System.out.println("nhập gender");
        String gender = scanner.nextLine();
        System.out.println("nhập age");
        int age = scanner.nextInt();

        NhanVien nhanVien = new NhanVien(name, age, gender);

        NhanVien[] newNV = new NhanVien[nhanViens.length + 1];
        for (int i = 0; i < nhanViens.length; i++) {
            newNV[i] = nhanViens[i];
        }

        newNV[newNV.length - 1] = nhanVien;
        return newNV;

    }

    public static NhanVien[] delete(NhanVien[] nhanViens){
        int index;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào vị trí cần xóa: ");
        index = scanner.nextInt();

        NhanVien[] newNV = new NhanVien[nhanViens.length - 1];

        for (int i = 0; i < nhanViens.length-1; i++) {
                    if (index > i) {
                        newNV[i] = nhanViens[i];
                    } else {
                        newNV[i] = nhanViens[i+ 1];
                    }
                }
        return newNV;
    }
}
