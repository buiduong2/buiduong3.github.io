public class App3 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "white", 10000);
        Car car1 = new Car("Chevrolet", "black", 10000);
        Car car2 = new Car("Ford", "pink", 10000);

        car.speed(30);
        car1.speed(10);
        car2.speed(20);
        
        car.display();
        car1.display();
        car2.display();

    }
}
