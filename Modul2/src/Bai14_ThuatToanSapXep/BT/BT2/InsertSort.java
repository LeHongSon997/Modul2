package Bai14_ThuatToanSapXep.BT.BT2;

public class InsertSort {
    static int[] list = {2,5,1,7,10,20,-2,17,6};

    public static void insertionSort(int[] list){
        int pos, x;
        for(int i = 1; i < list.length; i++){
            x = list[i];
            pos = i;
            while(pos > 0 && x < list[pos-1]){
                list[pos] = list[pos-1];
                pos--;
            }
            list[pos] = x;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " ");
        }
    }
}
