public class PrintEven {

            // Create a program that prints all the even numbers between 0 and 500

        public static void main(String args[]) {
            int n = 500;
            System.out.print("Even Numbers from 1 to "+n+" are: ");
            for (int i = 1; i <= n; i++) {

                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }

}
