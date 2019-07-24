import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class newCopyFile {
    public static void main(String[] args) {

        String inputFile = "egy.txt";
        String outputFile = "ketto.txt";

        System.out.println(copyContent(inputFile, outputFile));
    }
    private static boolean copyContent(String inputFile, String outputFile ) {

        Path inputPath = Paths.get(inputFile);
        Path outputPath = Paths.get(outputFile);

        try {
            List<String> lines = Files.readAllLines(inputPath);
            Files.write(outputPath, lines);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}