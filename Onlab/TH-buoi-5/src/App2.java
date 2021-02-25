public class App2 {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Duong";
        person.age = 1;
        person.address = "HN";
        System.out.println("Tôi tên là: " + person.name);
        person.move();
        person.study("Lap Trinh");
        person.hobby("CHoi game");

        System.out.println("\n\n");
        Person person2 = new Person();
        person2.name = "Duc";
        person2.age = 1;
        person2.address = "NH";
        System.out.println("Tôi tên là: " + person2.name);
        person2.move();
        person2.study("Trinh Lap");
        person2.hobby("game chơi");

        System.out.println("\n\n");
        Person person3 = new Person("bui", 1, "HN");
        person3.display();

        String s1 = "123";
        String s2 = "123";
        String s3 = s1;
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
    }
}
