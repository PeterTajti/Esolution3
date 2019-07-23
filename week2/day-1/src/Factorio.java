public class Factorio {
    public static void main(String[] args) {

        System.out.println(factorio(5));
    }

    private static int factorio(int input) {
        int factor = 1;
        for (int i = 2; i <= input; i++) {
            factor *= i;
        }
        return factor;
    }
}
