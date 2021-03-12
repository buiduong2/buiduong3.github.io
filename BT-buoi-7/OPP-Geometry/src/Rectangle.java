public class Rectangle extends Geometry implements IRectangle {
    private double length;
    private double width;

    public Rectangle() {

    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPremter() {
        return (width + length) * 2;
    }

    @Override
    public double getDiagonal() {
        return Math.sqrt(width * width + length * length);
    }

    @Override
    public void display() {
        System.out.printf("Chu vi: %.2f\tDiện tích: %.2f\tĐường chéo: %.2f\n", getPremter(), getArea(), getDiagonal());
    }
}
