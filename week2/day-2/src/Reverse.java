public class Reverse {
    public static void main(String... args) {

        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        String result = reverse(reversed);
        System.out.println(result);

        String bad = "JIHGFEDCBA";
        String good = fordito(bad);
        System.out.println(good);
    }
    private static String reverse (String input) {
        String output = "";

        for (int i = input.length() -1; i >= 0; i--){
            output = output + (input.charAt(i));
        }
        return output;
    }

    private static String fordito (String input) {
        String output ="";

        for (int i = input.length()-1; i >= 0 ; i--) {
            output = output + input.charAt(i);
        }

        return output;
    }



}

