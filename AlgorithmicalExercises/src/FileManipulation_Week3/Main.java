package FileManipulation_Week3;

public class Main {

  public static void main(String[] args) {

   // Functions.firstScanner();


    //
    int number = 0;
    int ten = 0;

    Functions.divide10(0,10);
    System.out.println(" --------- ");
    //
    Functions.readTHeFile();
    System.out.println(" --------- ");
    //
    Functions.countLines();
    System.out.println(" --------- ");
    //
    Functions.writeASingleLine();
    System.out.println(" --------- ");
    //
    String path = "";
    String word = "";
    int numr = 0;

    Functions.writeMultipleLines("C:/Users/Balint Berend/GreenFox/Practice/gyakorlo.txt","apple", 5);
    System.out.println(" --------- ");
    //
    String fileName1 = "C:/Users/Balint Berend/GreenFox/Practice/gyakorlo.txt";
    String fileName2 = "C:/Users/Balint Berend/GreenFox/Practice/masik.txt";
    Functions.copyFile(fileName1,fileName2);

  }


}
