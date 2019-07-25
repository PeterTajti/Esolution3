
package SharpieSet;

public class Sharpie {

    String color;
    double width;
    double inkAmount = 100;

    public Sharpie(String color, double width, double inkAmount){
        this.color = color;
        this.width = width;
        this.inkAmount = inkAmount;
    }

    public void use() {
        inkAmount = inkAmount - 1;
    }
}