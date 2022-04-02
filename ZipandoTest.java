package NIOfile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipandoTest {
    public static void main(String[] args) {
        Path destZip = Paths.get("C:\\Users\\Notebook\\Documents\\Projetos em java\\P.O.O\\src"); //destino do zip
        Path ondArc = Paths.get("Fulder\\subfolder"); //local dos arquivos
        Path nomZip = destZip.resolve("archivo.zip"); // nome do zip
        try (ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(nomZip.toFile()));
             DirectoryStream<Path> stream = Files.newDirectoryStream(ondArc)) {
                 for (Path p : stream) {
                    ZipEntry zipEnt = new ZipEntry(p.getFileName().toString());
                    zip.putNextEntry(zipEnt);
                    FileInputStream inStrm = new FileInputStream(p.toFile());
                    byte[] buff = new byte [2300];
                    int bytesLidos;
                    while ((bytesLidos = inStrm.read(buff)) > 0) {
                        zip.write(buff, 0, bytesLidos);
                    }
                    zip.closeEntry();
                    inStrm.close();
                }
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
}
