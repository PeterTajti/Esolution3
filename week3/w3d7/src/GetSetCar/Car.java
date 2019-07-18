package GetSetCar;

public class Car  {

    //fields are set private ---> encapsulation

    private int kilometer;
    private int price;

    public Car () {
        this.kilometer = 5;
    }

    public Car (int kilometer) {
        this.kilometer = kilometer;
    }

    //getters and setters
    //getters -> return type - > return something
    //setters -> void -> does not return anything

    public int getKilometer () {
        return kilometer;
    }

    public void setKilometer (int kilometer) {
        this.kilometer = kilometer;
    }

    public int getPrice () {
        return price;
    }

    public void setPrice (int price) {
        this.price = price;
    }


}