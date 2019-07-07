import java.util.Scanner;

public class ParametricAverage2 {

    public static void main(String[] args) {

        Scanner thenumber = new Scanner (System.in);

        System.out.println("Enter a number of how many number will we test");

        int number = thenumber.nextInt();
        int sum=0;
        int x;

        Scanner numbers = new Scanner (System.in);

        System.out.println("Enter the numbers to test");

        for (int i =1; i <= number; i++) {

            x = numbers.nextInt();
            sum += x;

        }

        System.out.println("the sum of the numbers is " + sum + " the average of the numbers is " + sum/number);

    }

}
