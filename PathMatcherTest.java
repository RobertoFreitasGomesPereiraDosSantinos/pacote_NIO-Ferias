package NIOfile;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;


public class PathMatcherTest {
    public static void main(String[] args) {
        Path pt1 = Paths.get("Fulder/subfolder/toma.txt");
        matchPath(pt1, "glob:**/*.txt");
    }
    private static void matchPath(Path pt, String glob) {
        PathMatcher mat = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(mat.matches(pt));
    }

}
