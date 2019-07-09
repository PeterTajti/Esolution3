// Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {

    public static void main(String[] args) {

        System.out.println(copy("File001.txt", "File002.txt"));
    }

    public static boolean copy(String sourcePath, String destinationPath)  {

        boolean success = true;

        try {

            Path filePath = Paths.get(sourcePath);
            Path filePath2 = Paths.get(destinationPath);

            Files.copy(filePath, filePath2);

        }

        catch (Exception e) {
            System.out.println(e);
            success = false;
        }
            return success;

    }

}
