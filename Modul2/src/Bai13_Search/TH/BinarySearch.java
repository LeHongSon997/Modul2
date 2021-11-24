package Bai13_Search.TH;

public class BinarySearch {
    static int[] list = {1,5,7,8,11,24,36,57,75};
    static int binarySearch(int[] list , int key) {
        int low = 0;
        int hight = list.length-1;
        while (hight >= low) {
            int mid = (low + hight) / 2;
            if (key < list[mid]) {
                hight = mid - 1;
            } else  if (key == list[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list,2));
        System.out.println(binarySearch(list,8));
        System.out.println(binarySearch(list,7));
        System.out.println(binarySearch(list,36));
        System.out.println(binarySearch(list,75));
        System.out.println(binarySearch(list,5));
    }
}
