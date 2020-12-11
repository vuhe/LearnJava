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
//        SystemIo.writeTriangleToFile(Triangle.of(2, 2, 3));
        var f = SystemIo.readFileToTriangle(new File("./testcase/triangle.txt"));
        SystemIo.printTriangle(f);
    }
}
