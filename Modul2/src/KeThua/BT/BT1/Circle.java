package KeThua.BT.BT1;

import KeThua.TH.Main;

public class Circle {
    private double bankinh = 1;
    private String color = "pink";

    public Circle(){
    }

    public Circle(double bankinh, String color) {
        this.bankinh = bankinh;
        this.color = color;
    }

    public double getBankinh() {
        return bankinh;
    }

    public void setBankinh(double bankinh) {
        this.bankinh = bankinh;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return bankinh * bankinh * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "bankinh=" + bankinh +
                ", color='" + color + '\'' +
                '}';
    }
}
