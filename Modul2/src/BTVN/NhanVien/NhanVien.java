package BTVN.NhanVien;

public class NhanVien {
    private int id;
    private String name;
    private int age;
    private String gender;

    private static int idNumber = 1;

    public NhanVien(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = idNumber++;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
