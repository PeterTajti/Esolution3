//Write a function, that takes two strings and returns a boolean value based on if the two strings are Anagramms or not.

package Tasks;

import java.util.Arrays;

public class Anagram {

    public boolean myAnagramFunction (String word1, String word2) {

//ez egy régebbi feladatból van:
// public static boolean anagram(String word1, String word2) {
//        char[] c1 = word1.toCharArray();
//        char[] c2 = word2.toCharArray();
//        Arrays.sort(c1);
//        Arrays.sort(c2);

//        String sc1 = new String(c1);
//        String sc2 = new String(c2);
//        return sc1.equalsIgnoreCase(sc2);
//    }



       // !!! ez az aktuiális feladat megoldása



        if (word1 == null || word2 == null) { //ha az első vagy a második szó nincs/nem létezik, akkor hamis
            return false;
        }

        //létrehozok két darab char(acter)-eket tartalmazó tömböt a string1-ből és a string2-ből

        char [] string1chars = word1.toCharArray();
        char [] string2chars = word2.toCharArray();

        //az Arrays.sort paranccsal kiszedjük a betűket és abc szerintio sorrendbe rakjuk őket,
        // pl. így nézhet ki ALMAFA -> AAAFLM

        Arrays.sort(string1chars);
        Arrays.sort(string2chars);

        //aztán létrehozok egy-egy karakterláncot a két karaktertömből

        String newString1 = new String (string1chars);
        String newString2 = new String (string2chars);

        //equalsIgnoreCase <- ez megnézni hogy egyenlő-e a kettő dolog úgy, hogy ignorálja a kis és nagybetűket

        return newString1.equalsIgnoreCase(newString2);
//


    }

}
