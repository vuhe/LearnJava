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
        " ".isBlank();// true

        //去除首尾空格
        " Java stack ".strip();// "Java stack"

        // 去除尾部空格
        "Java stack ".stripTrailing();// " Java stack"

        // 去除首部空格
        " Java stack".stripLeading();// "Java stack "

        // 复制字符串
        "Java".repeat(3);// "JavaJavaJava"

        // 行数统计
        "A\nB\nC".lines().count();// 3
    }

    public void collectionImprove() {
        var list = List.of("Java", "Python", "C");
        var copy = List.copyOf(list);
        System.out.println(list == copy);// true
    }
}
