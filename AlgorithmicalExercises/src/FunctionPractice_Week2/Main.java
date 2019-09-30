package FunctionPractice_Week2;

public class Main {

  public static void main(String[] args) {

    //
    String typo  = "Chincill";
    Functions.addA(typo);
    System.out.println(Functions.addA(typo));

    //
    String al = "Green Fox";
    Functions.greet(al);

    //
    int baseNum = 123;
    System.out.println(Functions.doubling(baseNum));

    //
    int nums = 4;
    System.out.println(Functions.sum(nums));

    String word1 = "dog";
    String world2 = "god";
    System.out.println(Functions.isAnagram(word1,world2));

    //
    String palindromworld = "fox";
    Functions.createPal(palindromworld);

    //

  }


}
