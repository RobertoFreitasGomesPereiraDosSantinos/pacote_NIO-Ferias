package NIOfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
// import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
// import java.nio.file.attribute.FileTime;

public class AtributosBasicosTest {
    public static void main(String[] args) {
        Path pt = Paths.get("C:\\Users\\Notebook\\Documents\\Projetos em java\\P.O.O\\src\\archivo.zip");
        try {
            DosFileAttributes attr = Files.readAttributes(pt, DosFileAttributes.class);
            System.out.println(attr.size());
            System.out.println(Files.isHidden(pt));
            // FileTime lastModified = attr.lastModifiedTime();
            // FileTime lastAccess = attr.lastAccessTime();
            // FileTime create = attr.creationTime();
            // BasicFileAttributeView bsView = Files.getFileAttributeView(pt, BasicFileAttributeView.class);
            // bsView.setTimes(lastModifiedTime, lastAccessTime, createTime);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
