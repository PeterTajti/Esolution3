//Given a non-negative integer n, return the sum of its digits recursively (without loops).
//Divide (/) by 10 removes the rightmost digit (e.g. 126 / 10 is 12).

public class SumDigits {
    public static void main(String[] args) {

        long x = sumDigits(2522);
        System.out.println(x);
    }

    public static long sumDigits(long i) {
        // ternary operator
        //return i == 0 ? 0 : i % 10 + sumDigits(i / 10);

        if (i==0) {
            return 0;
        }
        else {
            return i % 10 + sumDigits(i/10);

        }

    }

}
