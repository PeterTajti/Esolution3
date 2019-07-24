// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

import java.util.Scanner;
public class DivideByZero {
    public static void main(String[] args) {

        System.out.println("enter the divisor");

        Scanner scanner1 = new Scanner(System.in);
        int divisor = scanner1.nextInt();

        try {
            int result = 10 / divisor;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("fail");
        }
    }
}