package Farm;

public class Animal {

    String name;
    int hungerValue =50;
    int thirstValue=50;

    public Animal (String name) {
    this.name=name;
    }

    public int getHunger() {
        return hungerValue;
    }

    public String getStats () {
        return (name + " is " + hungerValue + " hungry ");
    }

    public void eat() {
        hungerValue--;
        System.out.println(name + " eats");
    }

    public void drink() {
        thirstValue--;
        System.out.println(name + " drinks");
    }

    public void play() {
        thirstValue++;
        hungerValue++;
        System.out.println(name + " plays");
    }

}
