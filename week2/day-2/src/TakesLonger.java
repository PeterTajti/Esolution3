public class TakesLonger {

    public static void main(String... args){
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        String b = quote.replace("It you", "It always takes longer than you"); //(1. megoldás)

        //String substring = hello.substring(0,5); // indextől indexig visszaad stringet

       // int index = quote.indexOf("you");

       // System.out.println(index);

       // String b = quote.substring (0, index);

       System.out.println(b);

        //System.out.println();
    }

}
