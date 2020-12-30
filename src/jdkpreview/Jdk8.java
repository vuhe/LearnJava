package jdkpreview;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 未完成
 *
 * @author zhuhe
 */
public class Jdk8 {
    /**
     * Lambda表达式的一些运用
     */
    public void lambda() {
        Arrays.asList(1, 2, 3, 4, 5, 6).forEach(e -> {
            System.out.println(e);
            System.out.println(Integer.toBinaryString(e));
        });

        Arrays.asList("a", "b", "d").sort(Comparator.reverseOrder());
    }

    /**
     * 函数接口，注解可以约束编译问题
     * 防止向接口中添加函数导致编译失败
     */
    @FunctionalInterface
    public interface Functional {
        /**
         * 测试方法
         */
        void method();
    }

    /**
     * 默认方法使得开发者可以在 不破坏二进制兼容性的前提下，
     * 往现存接口中添加新的方法，
     * 即不强制那些实现了该接口的类也同时实现这个新加的方法。
     */
    private interface Defaultable {
        /**
         * Interfaces now allow default methods, the implementer may or
         * may not implement (override) them.
         *
         * @return 默认实现
         */
        default String notRequired() {
            return "Default implementation";
        }
    }
}
