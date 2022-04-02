package NIOfile;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class AcharArquivos extends SimpleFileVisitor<Path> {
    public FileVisitResult visitFile(Path file, BasicFileAttributes attr) {
        if (file.getFileName().toString().endsWith(".txt")) {
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attr) {
        System.out.println("pasta: "+dir);
        return FileVisitResult.CONTINUE;
    }
}
public class FileVisitorTest {
    public static void main(String[] args) {
        try {
            Files.walkFileTree(Paths.get("Fulder"), new AcharArquivos());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
