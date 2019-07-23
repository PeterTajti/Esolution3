//Create a function named is anagram following your current language's style guide.
// It should take two strings and return a boolean value depending on whether its an anagram or not.

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {


        System.out.println(isAnagram("god", "dog"));

        System.out.println(isAnagram("cat", "dog"));

    }



    public static boolean isAnagram (String stringOne, String stringTwo) {

        stringOne.toLowerCase();
        stringTwo.toLowerCase();

        String [] lettersOne = stringOne.split("");
        String [] lettersTwo = stringTwo.split("");

        Arrays.sort(lettersOne);
        Arrays.sort(lettersTwo);

        ArrayList<String> lettersOneList = new ArrayList<>();
        ArrayList<String> lettersTwoList = new ArrayList<>();

        for (int i = 0; i < lettersOne.length; i++) {
            lettersOneList.add(lettersOne[i]);
        }
        for (int i = 0; i < lettersTwo.length; i++) {
            lettersTwoList.add(lettersTwo[i]);
        }
        return lettersOneList.equals(lettersTwoList);


    }


}
