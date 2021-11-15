package BTVN2;

import java.util.Objects;
import java.util.Scanner;

public class ControllerNhanVien {
    static NhanVien[] listNV = new NhanVien[0];
    static Scanner scanner = new Scanner(System.in);

    public static NhanVien createNhanVien(boolean isKySu) {
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập name");
        String name = scanner.nextLine();
        System.out.println("Nhập address");
        String address = scanner.nextLine();
        System.out.println("Nhập age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập workingDay");
        double workingDay = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập salary");
        double salary = Double.parseDouble(scanner.nextLine());

        if (!isKySu) {
            CongNhan congNhan = new CongNhan(id, name, age, address, workingDay, salary);
            return congNhan;
        } else {
            System.out.println("Nhập payRateSalary");
            double payRateSalary = Double.parseDouble(scanner.nextLine());
            KySu kySu = new KySu(id, name, age, address, workingDay, salary, payRateSalary);
            return kySu;
        }
    }

    public static void addNhanVien(NhanVien nhanVien) {
        NhanVien[] newArrNV = new NhanVien[listNV.length + 1];
        for (int i = 0; i < listNV.length; i++) {
            newArrNV[i] = listNV[i];
        }
        newArrNV[listNV.length] = nhanVien;

        listNV = newArrNV;
    }

    public static void showNhanVien(boolean isKySu) {
        if (!isKySu) {
            for (NhanVien nv : listNV) {
                if (nv instanceof CongNhan)
                    System.out.println(nv.toString());
            }
        } else {
            for (NhanVien nv : listNV) {
                if (nv instanceof KySu)
                    System.out.println(nv.toString());
            }
        }
    }

    public static void findIndexByName(NhanVien[] listNV) {
        System.out.println("nhập ten muốn tìm");
        String name = scanner.nextLine();

        for (int i = 0; i < listNV.length; i++) {
            if (Objects.equals(name, listNV[i].getName())) {
                System.out.println(listNV[i]);
            } else {
                System.out.println("Không tìm thấy nhân viên");
            }
        }
    }

    public static NhanVien[] deleteNhanVien(NhanVien[] listNV) {
        int index = findIndexById(listNV);
        if (index >= 0) {
            NhanVien[] nvNew = new NhanVien[listNV.length - 1];
            for (int i = 0; i < listNV.length - 1; i++) {
                if (i < index) {
                    nvNew[i] = listNV[i];
                } else {
                    nvNew[i] = listNV[i + 1];
                }
            }
            return nvNew;
        }
        return listNV;
    }

    public static int findIndexById(NhanVien[] listNV) {
        System.out.println("Nhập id muốn tìm");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < listNV.length; i++) {
            if (id == listNV[i].getId()) {
                return i;
            }
        }
        return -1;
    }

}
