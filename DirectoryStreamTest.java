package NIOfile;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTest {
    public static void main(String[] args) {
        Path dir = Paths.get("Fulder\\subfolder");
        try (DirectoryStream<Path> stre = Files.newDirectoryStream(dir)) {
            for (Path pat : stre) {
                System.out.println(pat.getFileName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
