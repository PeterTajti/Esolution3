import java.util.Scanner;

public class DrawPiramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = row; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}