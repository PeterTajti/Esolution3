// Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile2 {

    public static void main(String[] args) {

        System.out.println(copyfunction("File003.txt", "File004.txt"));

    }

    public static boolean copyfunction(String srcPath, String destPath) {

        boolean success = true;


        try {

            Path filePath1 = Paths.get(srcPath);
            List<String> lines1 = Files.readAllLines(filePath1);

            Path filePath2 = Paths.get(destPath);
            Files.write(filePath2, lines1);

            return success;

        } catch (Exception e) {
            System.out.println(e);

        }

        return false;

    }
}


