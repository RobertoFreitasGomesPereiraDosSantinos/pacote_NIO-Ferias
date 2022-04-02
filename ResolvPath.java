package NIOfile;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolvPath {
    public static void main(String[] args) {
        Path dir = Paths.get("home\\wila");
        Path arc = Paths.get("dem\\nego.txt");
        Path res = dir.resolve(arc);
        System.out.println(res);
    }
}
