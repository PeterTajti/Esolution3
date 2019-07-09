import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteFile {
    public static void main(String[] args) {
        List<String> content = new ArrayList();
        content.add("First line of my file");

        try {

            Path filePath = Paths.get("new-file.txt");
            Files.write(filePath, content);
        }

        catch (Exception e) {
            System.out.println("Uh-oh, could not write the file!");
        }

    }
}


