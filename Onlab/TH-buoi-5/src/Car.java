public class Car {
    public String brand;
    public String color;
    public int price;

    public Car(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public void speed(int number) {
        System.out.println(this.brand + " có tốc độ " + number + "km/h");
    }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
    }

}
