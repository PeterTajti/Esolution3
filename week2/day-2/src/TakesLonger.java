import java.lang.String;
public class TakesLonger {
    public static void main(String[] args) {

        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        String wordsToAdd = "always takes longer than ";

        StringBuilder myBuilder = new StringBuilder(quote);
        myBuilder.insert(21, wordsToAdd);
        System.out.println(myBuilder);
    }
}