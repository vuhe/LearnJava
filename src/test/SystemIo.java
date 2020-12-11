package test;

import java.io.File;

/**
 * @author vuhe
 */
public class SystemIo {

    public static void printTriangle(Triangle triangle) {
        System.out.print("此三角形边三长为 ");
        System.out.print(triangle.a + " ");
        System.out.print(triangle.b + " ");
        System.out.print(triangle.c + "\n\t");
        if (!triangle.isRightTriangle()) {
            System.out.print("不");
        }
        System.out.println("是直角三角形");
        System.out.println("\t三角形周长为 " + triangle.getPerimeter());
    }

    public static File writeTriangleToFile(Triangle triangle) {
        return new File("./testcase");
    }

    public static Triangle readFileToTriangle(File file) {
        return Triangle.of(2, 2, 3);
    }


}
