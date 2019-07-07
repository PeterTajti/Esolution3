import java.util.Scanner;

public class HelloUser {

    public static void main(String[] args) {
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user

        // Creates a scanner
        Scanner scanner1 = new Scanner(System.in);


        System.out.println("Enter user name!");

        String userInput1 = scanner1.nextLine();

        System.out.println("Hello " + userInput1);



    }

}
