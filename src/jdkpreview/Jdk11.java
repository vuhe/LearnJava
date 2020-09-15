package jdkpreview;

import java.util.List;

/**
 * 待续
 */
public class Jdk11 {
    public void localVariable() {
        var str = "test";
        System.out.println(str);
    }

    public void stringImprove() {
        // 判断字符串是否为空白
        var test = " ".isBlank();// true
        System.out.println(test);

        //去除首尾空格
        var str = " Java stack ".strip();// "Java stack"
        System.out.println(str);

        // 去除尾部空格
        str = "Java stack ".stripTrailing();// " Java stack"
        System.out.println(str);

        // 去除首部空格
        str = " Java stack".stripLeading();// "Java stack "
        System.out.println(str);

        // 复制字符串
        str = "Java".repeat(3);// "JavaJavaJava"
        System.out.println(str);

        // 行数统计
        var n = "A\nB\nC".lines().count();// 3
        System.out.println(n);
    }

    public void collectionImprove() {
        var list = List.of("Java", "Python", "C");
        var copy = List.copyOf(list);
        System.out.println(list == copy);// true
    }
}
