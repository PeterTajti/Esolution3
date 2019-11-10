package NullValues;

public class NullWithTryCatch {
  public static void main(String[] args) {

    Integer x = null;
    String s1 = "baba";

    int a = 20;
    int b = 5;

    try {
      int c = a / b;
      System.out.println(c);
    } catch (Exception e) {
      System.out.println("Error, u cant divide by zero!");
    }


  }
}
