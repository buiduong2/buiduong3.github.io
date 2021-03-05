import java.util.Scanner;

public abstract class Animal {
    private String name;
    private String gender;
    private int age;
    private float weight;
    private String color;
    protected Scanner sc = new Scanner(System.in);

    public Animal() {

    }

    public Animal(String name, String gender, int age, float weight, String color) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void eat(String food);

    public abstract float run(float speed);

    public abstract float sleep(float hours);

    public void input() {
        System.out.print("Nhập vào tên động vật : ");
        name = sc.nextLine();

        System.out.print("Nhập vào giới tính: 1 - Đực   | 2 - Cái: ");
        switch (Integer.valueOf(sc.nextLine())) {
            case 1:
                gender = "Đực";
                break;
            case 2:
                gender = "Cái";
                break;
            default:
                gender = null;
        }

        System.out.print("Nhập vào tuổi: ");
        age = Integer.valueOf(sc.nextLine());

        System.out.print("Nhập vào cân nặng: ");
        weight = Float.valueOf(sc.nextLine());

        System.out.print("Nhập vào màu sắc: ");
        color = sc.nextLine();

    }

    public String toString() {
        return "Name: " + name + "\t\tGender: " + gender + "\tAge: " + age + "\t\tWeight: " + weight + "\tColor: "
                + color;
    }
}
