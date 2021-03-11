public class Animal {
    private String name;
    private String numberOfFeet;
    private String sound;

    public Animal() {

    }

    public Animal(String name, String numberOfFeet, String sound) {
        this.name = name;
        this.numberOfFeet = numberOfFeet;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberOfFeet() {
        return numberOfFeet;
    }

    public void setNumberOfFeet(String numberOfFeet) {
        this.numberOfFeet = numberOfFeet;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

}
