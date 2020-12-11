package test;

import java.io.File;

/**
 * @author vuhe
 */
public class Main {
    public static void main(String... args) {
        Triangle test = SystemIo.readFileToTriangle(new File(""));
        SystemIo.printTriangle(test);
    }
}
