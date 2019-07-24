package Sharpie;

public class Sharpie {

    String color;
    int width;
    int inkAmount;

    Sharpie () {};

    void use () {
        inkAmount = inkAmount -1;
    }

}
