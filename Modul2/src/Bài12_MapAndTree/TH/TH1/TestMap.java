package Bài12_MapAndTree.TH.TH1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Sơn",24);
        hashMap.put("Vinh",30);
        hashMap.put("Đại",24);
        System.out.println("Các mục trong hashMap");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Hiển thị theo thứ tự giảm dần");
        System.out.println(treeMap + "\n");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Sơn",24);
        linkedHashMap.put("Vinh",30);
        linkedHashMap.put("Đại",24);
        System.out.println("\n Tuổi của Vinh là: " + linkedHashMap.get("Vinh"));
    }
}
