package Bài12_MapAndTree.BT;

import java.util.Scanner;

public class Main {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        public Main() {
            System.out.println("Menu Product");
            System.out.println("1: Thêm sản phẩm\n"
                    + "2: sửa thông tin sản phẩm\n"
                    + "3: Xóa sản phẩm\n"
                    + "4: Hiển thị sản phẩm\n"
                    + "5: Tìm kiếm sản phẩm\n"
                    + "6: Sắp xếp sản phẩm\n"
                    + "7: Tìm sản phẩm giá đắt nhất\n"
                    + "8: Exit");

            int chooseMenu = scanner.nextInt();
            switch (chooseMenu) {
                case 1:
                    productManager.add();
                    break;
                case 2:
                    productManager.editById();
                    break;
                case 3:
                    productManager.deleteById();
                    break;
                case 4:
                    productManager.showProduct();
                    break;
                case 5:
                    productManager.searchByName();
                    break;
                case 6:
                    productManager.sort();
                    break;
                case 7:
                    productManager.findMaxPrice();
                    break;
                case 8:
                    System.exit(7);
                    break;
            }
        }
    public static void main(String[] args) {
        new Main();
    }
}
