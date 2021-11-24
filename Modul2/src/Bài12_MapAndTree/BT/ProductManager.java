package Bài12_MapAndTree.BT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager extends Product {
    static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Product> product = new ArrayList<>();

    static {
        product.add(new Product("Sách", "JP", 50000, 50, "blue"));
        product.add(new Product("Sirius", "Suzuki", 6500000, 2, "red"));
        product.add(new Product("Tivi", "Arapxeut", 500000, 10, "black"));
        product.add(new Product("Tủ lạnh", "Tosiba", 500000, 10, "black"));
        product.add(new Product("Máy giặt", "Dewwo", 500000, 10, "black"));
    }

    public ProductManager(String name, String brand, double price, int quantity, String color) {
        super(name, brand, price, quantity, color);
    }

    public ProductManager() {
    }

    public void add() {
        while (true) {
            creat();

            System.out.println("Nhập bất kì để thêm tiếp sản phẩm - Nhập quit để về menu");
            String enterOrQuit = scanner.next();
            if (enterOrQuit.equalsIgnoreCase("quit")) {
                new Main();
            }
        }
    }

    public void editById() {
        while (true) {
            int product1 = findID();
            product.remove(product1);
            creat();

            System.out.println("Nhập bất kì để thêm tiếp sản phẩm - Nhập quit để về menu");
            String enterOrQuit = scanner.next();
            if (enterOrQuit.equalsIgnoreCase("quit")) {
                new Main();
            }
        }
    }

    public void deleteById() {
        while (true) {
            int product2 = findID();
            product.remove(product2);

            System.out.println("Nhập bất kì để thêm tiếp sản phẩm - Nhập quit để về menu");
            String enterOrQuit = scanner.next();
            if (enterOrQuit.equalsIgnoreCase("quit")) {
                new Main();
            }
        }
    }

    public void showProduct() {
        while (true) {
            for (Product list : product) {
                System.out.println(list.toString());
            }
            System.out.println("Nhập bất kì để thêm tiếp sản phẩm - Nhập quit để về menu");
            String enterOrQuit = scanner.next();
            if (enterOrQuit.equalsIgnoreCase("quit")) {
                new Main();
            }
        }
    }

    public void searchByName() {
        while (true) {
            System.out.println("Nhập tên muốn tìm");
            String name = scanner.nextLine();
            for (int i = 0; i < product.size(); i++) {
                if (name.equals(product.get(i).getName())) {
                    System.out.println(product.get(i).toString());
                }
            }
            System.out.println("Nhập bất kì để thêm tiếp sản phẩm - Nhập quit để về menu");
            String enterOrQuit = scanner.next();
            if (enterOrQuit.equalsIgnoreCase("quit")) {
                new Main();
            }
        }
    }

    public void sort() {
        PriceComparator priceComparator = new PriceComparator();
        Collections.sort(product, priceComparator);
        System.out.println("sắp xếp theo giá");
        for (Product price : product) {
            System.out.println(price.toString());
        }
    }

    public int findID() {
        System.out.println("Nhập id muốn tìm");
        int id = scanner.nextInt();
        for (int i = 0; i < product.size(); i++) {
            if (id == product.get(i).getId(id)) {
                return i;
            }
        }
        return id;
    }

    public void creat() {
        System.out.println("Nhập vào tên sản phẩm: ");
        String name = scanner.next();
        System.out.println("Nhập vào nhãn hàng sản phẩm: ");
        String brand = scanner.next();
        System.out.println("Nhập vào giá sản phẩm: ");
        double price = scanner.nextDouble();
        System.out.println("Nhập vào số lượng sản phẩm: ");
        int quantity = scanner.nextInt();
        System.out.println("Nhập vào màu sắc sản phẩm: ");
        String color = scanner.next();

        product.add(new Product(name, brand, price, quantity, color));
    }

    public void findMaxPrice() {
        int max = 0;
        int index = 0;
        for (int i = 0; i < product.size(); i++) {
            if (product.get(i).getPrice() > max) {
                max = (int) product.get(i).getPrice();
                index = i;
            }
        }
        System.out.println("Sản phẩm có giá cao nhất là: " + product.get(index));
    }
}
