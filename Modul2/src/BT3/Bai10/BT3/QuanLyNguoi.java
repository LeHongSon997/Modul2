package BT3.Bai10.BT3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class QuanLyNguoi extends HocVien implements QuanLy{

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<HocVien> persons = new ArrayList<>();

    @Override
    public void show() {
        for (HocVien person: persons) {
            System.out.println(person.toString());
        }
    }

    @Override
    public void add() {
        HocVien hocVien = creat();
        persons.add(hocVien);
    }

    @Override
    public void search() {
        System.out.println("Nhập vào tên muốn tìm");
        System.out.println();
        String name = scanner.nextLine();
        for (int i = 0; i < persons.size() ; i++) {
            if (name.equals(persons.get(i).getName())){
                int index = i;
                System.out.println("vị trí tên muốn tìm: " + index);
                break;
            } else {
                System.out.println("không có tên bạn muốn tìm trong danh sách");
            }
        }
    }

    @Override
    public void delete() {
        int hocVien = findIndex();
        persons.remove(hocVien);
    }

    @Override
    public void edit() {
        int index = findIndex();
        if (index >= 0) {
            HocVien newHV = creat();
            System.out.println(newHV);
        }
    }

    @Override
    public void sort() {
        int[] array = new int[persons.size()];
        Arrays.sort(array);
        System.out.println(persons);
    }

    @Override
    public void sum() {
        int tongDiem = 0;
        for (int i = 0; i < persons.size(); i++) {
            tongDiem = (int) (tongDiem + persons.get(i).getAvg());
        }
        System.out.println(tongDiem);
    }

    public static HocVien creat(){
        System.out.println("Nhập vào tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập vào tuổi: ");
        int age = scanner.nextInt();
        System.out.println("Nhập vào điểm: ");
        float avg = scanner.nextFloat();
        HocVien hocVien = new HocVien(name,age,avg);
        return hocVien;
    }

    public int findIndex(){
        System.out.println("Nhập vào id muốn tìm");
        int index = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < persons.size(); i++) {
           if (index == persons.get(i).getId()) {
               return i;
           }
        }
        return index;
    }
}
