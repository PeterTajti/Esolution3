
public class Sharpie {

    String color;
    double width;
    double inkAmount = 100;

    public Sharpie(String c, double width, double inkAmount){
        color = c;
        this.width = width;
        this.inkAmount = inkAmount;
    }

    public void use() {
        inkAmount = inkAmount - 1;
    }
}