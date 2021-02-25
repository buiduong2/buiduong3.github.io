public class App4 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Mướp", "black", 'm');
        Cat cat2 = new Cat("Xiêm", "white", 'f');
        Cat cat3 = new Cat("Anh Lông Dài", "yellow", 'c');

        cat1.sound();
        cat2.sound();
        cat3.sound();

        cat1.display();
        cat2.display();
        cat3.display();

    }
}
