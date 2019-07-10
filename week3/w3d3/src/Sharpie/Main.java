package Sharpie;

public class Main {

    public static void main (String [] args){

    Sharpie pen1 = new Sharpie("blue", 23);

    pen1.use();

        System.out.println("ennyi tinta maradt " + pen1.inkAmount);
        System.out.println(pen1.color + pen1.width);

    }

}
