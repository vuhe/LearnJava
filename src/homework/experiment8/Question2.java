package homework.experiment8;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Question2 {
    public static void main(String[] args) {
        // 调用函数
        writeFile1();
        System.out.println("===================");
        // 调用函数
        writeFile2(); // JDK 7及以上才可以使用
    }

    public static void writeFile1() {
        System.out.println("writeFile1()");
        // 声明变量
        FileOutputStream fos = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        try {
            // 打开文件，同时对输入流进行包装
            fos = new FileOutputStream("./testcase/abc.txt");
            osw = new OutputStreamWriter(fos, "UTF-8");
            osw = new OutputStreamWriter(fos);
            bw = new BufferedWriter(osw);
            // br = new BufferedWriter(new OutputStreamWriter(new
            // FileOutputStream("c:/temp/abc.txt")))
            // 写入文件
            bw.write("我们是");
            bw.newLine();
            bw.write("信工学子");
            bw.newLine();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            // 释放文件资源
            try {
                bw.close(); // 关闭最后一个类，会将所有的底层流都关闭
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void writeFile2() {
        System.out.println("writeFile2()");
        // 打开文件的简写方式，此方式会自动释放资源
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
                        new FileOutputStream("./testcase/abc.txt")))) {
            // 写入文件
            bw.write("我们是");
            bw.newLine();
            bw.write("2018级软件工程专业");
            bw.newLine();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
