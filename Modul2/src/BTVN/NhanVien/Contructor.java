package BTVN.NhanVien;

import java.util.Scanner;

public class Contructor {
    static Scanner scanner = new Scanner(System.in);


    public static void show(NhanVien[] nhanViens) {
        for (NhanVien nv : nhanViens) {
            System.out.println(nv.toString());
        }
    }

    public static NhanVien[] createNhanVien(NhanVien[] nhanViens) {
        NhanVien nhanVien = create();
        NhanVien[] newNV = new NhanVien[nhanViens.length + 1];
        for (int i = 0; i < nhanViens.length; i++) {
            newNV[i] = nhanViens[i];
        }
        newNV[newNV.length - 1] = nhanVien;
        return newNV;
    }


    public static NhanVien create() {
        System.out.println("nhập name");
        String name = scanner.nextLine();
        System.out.println("nhập gender");
        String gender = scanner.nextLine();
        System.out.println("nhập age");
        int age = scanner.nextInt();
        NhanVien nhanVien = new NhanVien(name, age, gender);
        return nhanVien;
    }


    public static NhanVien[] editNhanVien(NhanVien[] nhanViens) {
        int index = findIndexById(nhanViens);
        if (index >= 0) {
            NhanVien newNV = create();
            nhanViens[index].setAge(newNV.getAge());
            nhanViens[index].setName(newNV.getName());
            nhanViens[index].setGender(newNV.getGender());
        }
        return nhanViens;
    }

    // Xóa theo id của nhân viên
    public static NhanVien[] delete(NhanVien[] nhanViens) {
        int index = findIndexById(nhanViens);
        if (index >= 0) {
            NhanVien[] nvNew = new NhanVien[nhanViens.length - 1];
            for (int i = 0; i < nhanViens.length - 1; i++) {
                if (i < index) {
                    nvNew[i] = nhanViens[i];
                } else {
                    nvNew[i] = nhanViens[i + 1];
                }
            }
            return nvNew;
        }
        return nhanViens;
    }


    public static int findIndexById(NhanVien[] nhanViens) {
        System.out.println("nhập id muốn tìm");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < nhanViens.length; i++) {
            if (id == nhanViens[i].getId()) {
                return i;
            }
        }
        return -1;
    }
}
