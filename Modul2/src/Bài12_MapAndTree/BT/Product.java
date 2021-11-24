package Bài12_MapAndTree.BT;

public class Product implements Comparable<Product>{
    private String name;
    private String brand;
    private double price;
    private int quantity;
    private String color;
    private int id;

    public static int idNumber = 1;


    public Product(String name, String brand, double price, int quantity,String color) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
        this.id = idNumber++;
    }

    public Product() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId(int id) {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", color='" + color + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return 0;
    }
}
