public class Cat {
    public String species;
    public String color;
    public char gender;

    public Cat(String species, String color, char gender) {
        this.species = species;
        this.color = color;
        this.gender = gender;

    }

    public void sound() {
        System.out.println(species+" says meow meow");
    }

    public void display() {
        System.out.println();
        System.out.println("species: " + species);
        System.out.println("Color: " + color);
        if (gender == 'm') {
            System.out.println("gender: Male");
        } else if (gender == 'f') {
            System.out.println("gender: Female");
        } else {
            System.out.println("gender: Unknown");
        }
    }
}
