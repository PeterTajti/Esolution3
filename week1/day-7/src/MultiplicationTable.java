import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String args[]) {

        // Create a program that asks for a number and prints the multiplication table with that number
// Example:
// The number 15 should print:
//
// 1 * 15 = 15

        int x,y;

        System.out.println("Enter a NUMBER, IT WILL BE MULTIPLICATED BY 15");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();

        y = (x*15);

        System.out.println(x + "*15" + "=" + y);



    }
}
