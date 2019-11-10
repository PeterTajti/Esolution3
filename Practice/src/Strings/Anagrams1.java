package Strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Anagrams1 {



  static boolean isAnagram(String a, String b) {
    boolean result = false;

    a = a.toUpperCase();
    List<String> aLetters = Arrays.asList(a.split(""));
    Collections.sort(aLetters);

    b = b.toUpperCase();
    List<String> bLetters = Arrays.asList(b.split(""));
    Collections.sort(bLetters);

    if (aLetters.equals(bLetters)) {
      result = true;
      System.out.println("They are anagrams.");
    } else {
      System.out.println("They are not anagrams.");
    }

    return result;
  }

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    String b = scan.next();
    scan.close();

    isAnagram(a, b);


  }
}
