package FileIOwithSeperatedFunctionsInOwnClasses;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

  public List<String> readFile(Path path){
    List<String> lines = new ArrayList<>();
    try{
      lines = Files.readAllLines(path);
    } catch (Exception ex) {
      System.out.println("File does not exist!");
    }
    return lines;
  }

}
