package tool;

import java.util.*;

public class Untitled {

    private static void  test() {
        long startTime1 = System.nanoTime();
        for (int i = 0; i < 100000000; i++) {

        }
        long endTime1 = System.nanoTime();
        System.out.println("i++ time(ms):" + (endTime1 - startTime1) / 1000);
        System.out.println("i++ time(s):" + (endTime1 - startTime1) / 1000 / 1000);

        long startTime2 = System.nanoTime();
        for (int i = 0; i < 100000000; ++i) {

        }
        long endTime2 = System.nanoTime();
        System.out.println("++i time(ms):" + (endTime2 - startTime2) / 1000);
        System.out.println("++i time(s):" + (endTime2 - startTime2) / 1000 / 1000);
    }

    public static void main(String[] args) {
        Untitled.test();
        Properties props=System.getProperties(); //获得系统属性集
        String osName = props.getProperty("os.name"); //操作系统名称
        String osArch = props.getProperty("os.arch"); //操作系统构架
        String osVersion = props.getProperty("os.version"); //操作系统版本
        System.out.println(osName);
        System.out.println(osArch);
        System.out.println(osVersion);
        String.valueOf(0);
    }
}
