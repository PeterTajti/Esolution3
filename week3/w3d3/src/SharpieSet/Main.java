import java.util.Arrays;

public class Main {
    public static void main(String[] args) {



        SharpieSet sharpieset1 = new SharpieSet();

        Sharpie sharpieblue = new Sharpie("Blue", 1.2, 122);
        sharpieset1.add(sharpieblue);
        Sharpie sharpieRed = new Sharpie("Red", 1.2, 1);
        sharpieset1.add(sharpieRed);
        Sharpie sharpiePink = new Sharpie("Pink", 1.2, 12);
        sharpieset1.add(sharpiePink);

        sharpieRed.use();
        sharpieset1.removeTresh();
        for (int i = 0; i < sharpieset1.sharpieList.size(); i++) {
            System.out.println(sharpieset1.sharpieList.get(i).inkAmount);
        }



        sharpieset1.countUseable();



    }
}