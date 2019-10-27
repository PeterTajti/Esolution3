package Codewars;

public class Vowels {

  public static int getCount(String str) {
    int vowelsCount = 0;

    str.toLowerCase();

    char[] characters = str.toCharArray();

    for (int i = 0; i < characters.length; i++) {
      if (characters[i] == 'a') {
        vowelsCount = vowelsCount + 1;
      }
      if (characters[i] == 'e') {
        vowelsCount = vowelsCount + 1;
      }
      if (characters[i] == 'i') {
        vowelsCount = vowelsCount + 1;
      }
      if (characters[i] == 'o') {
        vowelsCount = vowelsCount + 1;
      }
      if (characters[i] == 'u') {
        vowelsCount = vowelsCount + 1;
      }
    }

    return vowelsCount;
  }

  public static void main(String[] args) {

    String string1 = "blackdragon";

    System.out.println(getCount(string1));


  }

}