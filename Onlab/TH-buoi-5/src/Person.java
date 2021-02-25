public class Person {
    public String name;
    public int age;
    public String address;

    public Person() {
        System.out.println("Gọi tới constructor");
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("age: " + age);
        System.out.println("Address: " + address);
    }

    public void move() {
        System.out.println("Phương thức study move");
        System.out.println(name + " study English");
    }

    public void study(String subject) {
        System.out.println("Phương thức study");
        System.out.println(name + " Study " + subject);
    }

    public void hobby(String hobby) {
        System.out.println(name + " Thích " + hobby);
    }
}
