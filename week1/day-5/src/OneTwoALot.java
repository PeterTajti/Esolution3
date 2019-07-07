import java.util.Scanner;

public class OneTwoALot {

    public static void main(String[] args) {

                int x;

        System.out.println("Enter an integer to check its size");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();

        if (x <= 0) {
            System.out.println("Not enough");
        }

        else if (x < 3) {
            System.out.println(x + " (this number is enough)");
        }

        else  {
            System.out.println("A lot");
        }

    }
}



