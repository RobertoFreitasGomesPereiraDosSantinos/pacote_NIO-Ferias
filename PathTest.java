package NIOfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest {
    public static void main(String[] args) {
        Path p2 = Paths.get("Fulder\\subfolder\\");
        Path p3 = Paths.get("Fulder\\subfolder\\Sussubfulder\\dhabo.txt");
        try {
            if (Files.notExists(p2) && Files.notExists(p3)) {
                Files.createDirectories(p2);
                Files.createFile(p3);
            }
            Path source = Paths.get("Fulder\\subfolder\\Sussubfulder\\dhabo.txt");
            Path target = Paths.get("Fulder\\subfolder\\dhabotaCopyparsa.txt");
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
