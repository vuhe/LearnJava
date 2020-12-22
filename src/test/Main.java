package test;

import java.io.File;

/**
 * @author vuhe
 */
public class Main {
    /**
     * 驱动程序
     * <p>
     * 用于拉起整个程序的测试运行
     *
     * @param args 入参
     */
    public static void main(String... args) {
        System.out.println("input: ");
        readFileAndOutput(new File("./testcase/triangle.txt"));
    }

    public static File readFileAndOutput(File file) {
        var triangle = SystemIo.readFileToTriangle(file);
        SystemIo.printTriangle(triangle);
        return SystemIo.writeTriangleToFile(triangle);
    }
}
