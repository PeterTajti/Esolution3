package FunctionPractice_Week2;

import java.util.ArrayList;
import java.util.Collections;

public class Functions {

  public static String addA(String typo) {

    return typo+"a";
  }

  public static void greet(String al) {

    System.out.println("Greetings" + al);
  }

  public static int doubling(int baseNum) {

    return baseNum*2;
  }

  public static int sum(int nums) {

    int number = 0;
    for (int i = 0; i < nums+1; i++) {
      number+=i;
    }
    return number;
  }

  public static boolean isAnagram(String word1, String word2) {

    ArrayList word1List = new ArrayList();
    ArrayList word2List = new ArrayList();

    for (int i = 0; i < word1.length(); i++) {
      word1List.add(word1.charAt(i));
    }
    for (int j = 0; j <word2.length(); j++) {
      word2List.add(word2.charAt(j));
    }

    Collections.sort(word1List);
    Collections.sort(word2List);

    System.out.println(word1List);
    System.out.println(word2List);

    return word1List.equals(word2List);
  }

  public static String  createPal(String palindromworld) {

    ArrayList palindrom = new ArrayList();


    for (int i = palindromworld.length()-1; i >= 0; i --) {

      palindrom.add(palindromworld.charAt(i));
    }
    palindromworld += palindrom;

    System.out.println(palindromworld);
    return palindromworld;

  }

}
