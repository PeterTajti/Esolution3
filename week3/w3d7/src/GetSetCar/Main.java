package GetSetCar;

public class Main {

    public static void main(String[] args) {

        Car skoda = new Car ();

        skoda.setKilometer(180);
        skoda.setPrice(500000);

        System.out.println("the skoda already run " + skoda.getKilometer() + " km");
        System.out.println("the skoda is priced at " + skoda.getPrice() + " HUF");
    }

}