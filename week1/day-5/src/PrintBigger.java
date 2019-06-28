import java.util.Scanner;

public class PrintBigger {

    public static void main(String[] args) {

        // Write a program that asks for two numbers and prints the bigger one

        int a,b;

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter 2 number");
        Scanner in = new Scanner(System.in);

        a = in.nextInt();
        b = in.nextInt();

            if (a > b )
        System.out.println(a);

            if (b > a)
                System.out.println(b);

    }
}
