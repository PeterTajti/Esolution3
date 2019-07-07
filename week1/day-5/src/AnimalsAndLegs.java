import java.util.Scanner;

public class AnimalsAndLegs {

    public static void main(String[] args) {

               int x, y, z, q;



        System.out.println("enter the number of chickens, press enter, then the number of pigs, and press enter again");
        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();
        z = x + y;
        q = (x*2)+(y*4);

        System.out.println("the number of chickens = " + x);
        System.out.println("the number of pigs = " + y);
        System.out.println("the number of animals = " + z);
        System.out.println("the number of legs = " + q);

    }

}
