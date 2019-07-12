public class NumberAdder {

    public static void main(String[] args) {

        int x = addNumbers(10, 0);
        System.out.println(x);
    }



    private static int addNumbers(int limit, int sum) {
        if (limit > 0) {
            sum += limit;
            limit--;
            return addNumbers(limit, sum);
        } else {
            return sum;
        }
    }


}