import java.util.Scanner;

public class CountFromTo {

    public static void main(String args[]) {

           int a, b;

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter two number");
        Scanner in = new Scanner(System.in);

        a = in.nextInt();
        b = in.nextInt();

        if (a > b) {
            System.out.println("The second number should be bigger");

        } else if (a < b) {

            for (int i = a+1; i < b; i++)
                System.out.println(i);
            }


    }

}
