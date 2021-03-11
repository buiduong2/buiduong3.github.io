public class Circle extends Geometry implements ICircle {
    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getDiameter() {
        return radius * 2;
    }

    @Override
    public double getArea() {
        // Có thể dugnf hàm Math.PI ; nhưng để đơn giản dùng 3.14 ạ;
        return 3.14 * radius * radius;
    }

    @Override
    public double getPremter() {
        return 2 * 3.14 * radius;
    }

    @Override
    public void display() {
        System.out.printf("Chu vi: %.2f\tDiện tích: %.2f\t\tĐường kính: %.2f\n", getPremter(), getArea(),
                getDiameter());
    }
}
