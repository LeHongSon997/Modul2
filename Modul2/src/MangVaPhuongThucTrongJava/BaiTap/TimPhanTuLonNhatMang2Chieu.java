package MangVaPhuongThucTrongJava.BaiTap;

public class TimPhanTuLonNhatMang2Chieu {
    public static void main(String[] args) {
        int[][] array = {
                {5,2,1,5},
                {4,1,6,7}
        };
        double a = 0.0;
        int x;
        int y;
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                if (a < array[row][column]) {
                    a = array[row][column];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong ma trận: " + a);
    }
}
