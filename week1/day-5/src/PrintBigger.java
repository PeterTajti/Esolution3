import java.util.Scanner;

public class PrintBigger {

    public static void main(String[] args) {

        // Write a program that asks for two numbers and prints the bigger one

        int a,b;

        System.out.println("enter two number");
        Scanner in = new Scanner(System.in);

        a = in.nextInt();
        b = in.nextInt();

            if (a > b )
        System.out.println(a);

            if (b > a)
                System.out.println(b);

            if (a==b)
                System.out.println("problem, the two number is the same");
    }
}
