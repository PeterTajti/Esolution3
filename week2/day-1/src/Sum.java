public class Sum {

    // Create the usual class wrapper and main method on your own.
// Write a function called `sum` that returns the sum of numbers from zero to the given parameter

        public static void main(String[] args) {
            int theNumber = 5;
            sum(theNumber);
            System.out.println(sum(theNumber));
        }

        private static int sum(int a) {
            int sum=0;

            for (int i = 0; i <=a ; i++) {
                sum += i;
            }
            return sum;
        }

}
