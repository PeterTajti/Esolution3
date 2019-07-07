public class Sum {
    public static void main(String[] args) {
        int myNumber = 3;
        sum(myNumber);
        System.out.println(sum(myNumber));
    }

    private static int sum(int a) {
        int sum=0;
        for (int i = 0; i <=a ; i++) {
            sum += i;
        }
        return sum;
    }
}