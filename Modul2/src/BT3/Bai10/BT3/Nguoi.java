package BT3.Bai10.BT3;

public class Nguoi {
    private String name;
    private int age;
    private int id;

    public static int idNumber = 1;

    public Nguoi(){}

    public Nguoi(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = idNumber++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person {" + id + '\'' +
                "name='" + name + '\'' +
                ", age=" + age
                ;
    }
}
