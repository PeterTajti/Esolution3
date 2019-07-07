import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {

        Scanner userInput = new Scanner((System.in));
        System.out.println("Add a number");
        int b = userInput.nextInt();
        int sum = 0, val;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add as many number(s) that you wrote in the first line");

        for (int i = 1; i <= b; i++) {

            val = scanner.nextInt();
            sum += val;
        }
        System.out.println("Sum: " + sum + "   Average: " + (sum / b));
    }
}