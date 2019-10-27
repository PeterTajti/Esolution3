package Codewars;

public class Troll {

  public static String disemvowel(String str) {
    return str.replaceAll("[aeiouAEIOU]", "");

  }

  public static void main(String[] args) {

    String string1 = "This is a beautiful sentence.";

    String string2 = disemvowel(string1);

    System.out.println(string2);

  }

}