public class Pets extends Animal {
    public Pets() {

    }

    public Pets(String name, String gender, int age, float weight, String color) {
        super(name, gender, age, weight, color);
    }

    @Override
    public void input() {
        super.input();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void eat(String food) {
        System.out.println(this.getName() + " eats " + food);
    }

    @Override
    public float run(float speed) {
        return speed;
    }

    @Override
    public float sleep(float hours) {
        return hours;
    }

}
