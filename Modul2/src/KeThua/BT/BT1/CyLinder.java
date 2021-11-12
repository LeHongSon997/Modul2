package KeThua.BT.BT1;

public class CyLinder extends Circle{
    private double chieuCao = 1;

    public CyLinder(){
    }

    public CyLinder(double chieuCao){
        super();
        this.chieuCao = chieuCao;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public double getVolume() {
        return getArea() * chieuCao;
    }

    @Override
    public String toString() {
        return "CyLinder{" +
                "chieuCao=" + chieuCao +
                '}';
    }
}
