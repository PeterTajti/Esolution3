import java.util.Scanner;

public class PartyIndicator {

    public static void main(String[] args) {

// Write a program that asks for two numbers
// The first number represents the number of girls that comes to a party, the
// second the boys
// It should print: The party is excellent!
// If the the number of girls and boys are equal and 20 or more people are coming to the party
//
// It should print: Quite cool party!
// If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
//
// It should print: Average party...
// If there are less people coming than 20
//
// It should print: Sausage party
// If no girls are coming, regardless the count of the people

        int x, y, z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number of girls, press enter, then the number of the boys, and press enter again");
        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();
        z = x + y;

        System.out.println("the number of girls and boys = " + z);

        if (z > 20 && x == y) {
            System.out.println("The party is excellent!");
        }

        if (x != y && z >= 20) {
            System.out.println("Quite cool party");
        }

        if (x+y < 20 && x > 1) {
            System.out.println("Average party...");
        }

        if (x == 0) {
            System.out.println("Sausage party");
        }

    }
}
