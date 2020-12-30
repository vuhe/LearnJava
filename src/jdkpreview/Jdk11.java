package jdkpreview;

import java.util.List;

/**
 * 待续
 *
 * @author zhuhe
 */
public class Jdk11 {
    public void localVariable() {
        var str = "test";
        System.out.println(str);
    }

    public void stringImprove() {
        // 判断字符串是否为空白
        // true
        var test = " ".isBlank();
        System.out.println(test);

        //去除首尾空格
        // "Java stack"
        var str = " Java stack ".strip();
        System.out.println(str);

        // 去除尾部空格
        // " Java stack"
        str = "Java stack ".stripTrailing();
        System.out.println(str);

        // 去除首部空格
        // "Java stack "
        str = " Java stack".stripLeading();
        System.out.println(str);

        // 复制字符串
        // "JavaJavaJava"
        str = "Java".repeat(3);
        System.out.println(str);

        // 行数统计
        // 3
        var n = "A\nB\nC".lines().count();
        System.out.println(n);
    }

    public void collectionImprove() {
        var list = List.of("Java", "Python", "C");
        var copy = List.copyOf(list);
        // true
        System.out.println(list == copy);
    }
}
