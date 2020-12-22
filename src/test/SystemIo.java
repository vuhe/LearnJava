package test;

import java.io.*;
import java.util.Objects;

/**
 * @author vuhe
 */
class SystemIo {
    /**
     * 默认存储路径
     */
    private static final String PATH = "./testcase/triangle.txt";

    /**
     * 打印三角形
     *
     * @param triangle 三角形
     */
    static void printTriangle(Triangle triangle) {
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

    /**
     * 将三角形写入文件
     *
     * @param triangle 三角形
     * @return 写入的文件
     */
    static File writeTriangleToFile(Triangle triangle) {
        File file = new File(PATH);
        try (var out = new FileWriter(file)) {
            out.write(triangle.a + "\n");
            out.write(triangle.b + "\n");
            out.write(triangle.c + "\n");
            out.write(Objects.hash(triangle.a, triangle.b, triangle.c) + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    /**
     * 从文件读取三角形
     *
     * @param file 文件
     * @return 三角形
     */
    static Triangle readFileToTriangle(File file) {
        // 检查是否是文件
        if (!file.isFile()) {
            throw new IllegalArgumentException("传入文件错误");
        }
        // 生产的三角形
        Triangle triangle = null;
        // 读取
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            int[] n = new int[3];
            for (int i = 0; i < 3; i++) {
                n[i] = Integer.parseInt(br.readLine());
            }
            // hash值校验
            if (Objects.hash(n[0], n[1], n[2]) != Integer.parseInt(br.readLine())) {
                throw new IOException("文件损坏，检查文件");
            }
            triangle = Triangle.of(n[0], n[1], n[2]);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 返回
        return triangle;
    }
}
