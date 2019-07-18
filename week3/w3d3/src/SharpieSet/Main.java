
package SharpieSet;

public class Main {

    public static void main(String[] args) {

        SharpieSet penbox = new SharpieSet();

        Sharpie pen1 = new Sharpie ("red", 10, 100);

        for (int i = 0; i < 50; i++) {
            pen1.use();
        }

        Sharpie pen2 = new Sharpie("Blue", 10, 30);
        Sharpie pen3 = new Sharpie("Black", 10, 20);

        penbox.addSharpie(pen1);
        penbox.addSharpie(pen2);
        penbox.addSharpie(pen3);

        System.out.println(penbox.countUsable());

        penbox.removeTrash();

    }

}