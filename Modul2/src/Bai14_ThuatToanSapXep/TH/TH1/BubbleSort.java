package Bai14_ThuatToanSapXep.TH.TH1;

public class BubbleSort {
    static int[] list = {2,5,1,7,10,20,-2,17,6};

    public static void bubbleSort(int[] list) {
        boolean checkPass = true;

        for (int i = 1; i < list.length && checkPass; i++) {
            checkPass = false;

            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;

                    checkPass = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " ");
        }
    }
}
