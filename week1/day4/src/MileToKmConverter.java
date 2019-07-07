import java.util.Scanner;

public class MileToKmConverter {

    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Enter a distance in miles!");

        double b = scanner1.nextDouble();
        double c = (b * 1.6);

        System.out.println(c);

    }
}

