package BT3.Bai10.BT3;

public class HocVien extends Nguoi{
    public float avg;

    public HocVien(){
    }

    public HocVien(String name, int age, float avg) {
        super(name, age);
        this.avg = avg;
    }


    public float getAvg() {
        return avg;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return  super.toString() + '\'' +
                "diem=" + avg +
                '}';
    }
}
