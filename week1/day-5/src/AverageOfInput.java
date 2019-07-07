import java.util.Scanner;

// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4

public class AverageOfInput {

    public static void main(String[] args) {

        int a, b, c, d, e;
        double x, y;

        System.out.println("enter five number in a row, then press ENTER");
        Scanner in = new Scanner(System.in);

        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();
        e = in.nextInt();

        x = (a+b+c+d+e);
        y = (double) (a+b+c+d+e)/ 5;

        System.out.println("Sum: " + x);
        System.out.println("Average: " + y);



    }

}
