package FileManipulation_Week3;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Functions {

  public static void firstScanner() {

    System.out.println("input");
    Scanner newscanner = new Scanner(System.in);


    int divisor = newscanner.nextInt();

    int result = 12 / divisor;
    System.out.println("output");
    System.out.println(result);

  }

  public static void divide10(int number, int ten) {

    try {
      int dividing = ten / number;
      System.out.println(dividing);
    } catch (Exception e) {
      System.out.println("nope");
    }
  }

  public static void readTHeFile() {


    try {

      Path filePath = Paths.get("C:/Users/Balint Berend/GreenFox/Practice/gyakorlo.txt");

      List<String> lines = Files.readAllLines(filePath);

      System.out.println(lines);

    } catch (Exception e) {

      System.out.println("Unable to read file");

    }
  }

  public static int countLines() {

    try {

      Path filePath = Paths.get("C:/Users/Balint Berend/GreenFox/Practice/gyakorlo.txt");

      List<String> xyz = Files.readAllLines(filePath);


      return xyz.size();

    } catch (Exception e) {

      return 0;

    }

  }

  public static void writeASingleLine() {

    List<String> content = new ArrayList<>();
    content.add("Balint Berend");

    try {

      Path filePath = Paths.get("C:/Users/Balint Berend/GreenFox/Practice/gyakorlo.txt");
      Files.write(filePath, content);

      System.out.println(content);
    } catch (Exception e) {

      System.out.println("no");

    }
  }

  public static void writeMultipleLines(String path, String word, int num) {

    List<String> blabla = new ArrayList<>();
    for (int i = 0; i < num; i++) {
      blabla.add(word);
    }

    try {

      Path filePath = Paths.get(path);
      Files.write(filePath, blabla);

      System.out.println(blabla);
    } catch (Exception e) {

      System.out.println("no");

    }

  }

  public static boolean copyFile(String fileName1, String fileName2) {

    try {
      List<String> fileContent = Files.readAllLines(Paths.get(fileName1));

      Files.write(Paths.get(fileName2), fileContent);

      return true;

    } catch (Exception e) {

      System.out.println("no");

    }
    return false;
  }
}
