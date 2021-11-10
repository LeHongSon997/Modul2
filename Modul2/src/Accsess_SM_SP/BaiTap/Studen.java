package Accsess_SM_SP.BaiTap;

public class Studen {
    private static String name = "jons";
    private static String classes = "CO2";

    public Studen(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public Studen(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
