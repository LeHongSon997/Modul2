package Accsess_SM_SP.BaiTap.BT2;

import Accsess_SM_SP.BaiTap.BT2.Studen;

public class Tess {
    public static void main(String[] args) {
        Studen studen = new Studen();
        studen.setName("son");
        studen.setClasses("segay");
        System.out.println(studen.getName());
        System.out.println(studen.getClasses());
    }
}
