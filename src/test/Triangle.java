package test;

import java.util.Arrays;

/**
 * @author vuhe
 */
class Triangle {
    /**
     * 从小到大赋值
     * 即 a <= b <= c
     */
    int a, b, c;

    private Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // 生成模块

    static Triangle of(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalArgumentException("三角形三边长不能为负数！");
        }
        int[] nums = new int[]{a, b, c};
        Arrays.sort(nums);
        int lenSum = nums[0] + nums[1];
        if (lenSum < 0) {
            throw new IllegalArgumentException("入参超界！");
        }
        if (lenSum <= nums[2]) {
            throw new IllegalArgumentException("不是一个三角形！");
        }
        return new Triangle(a, b, c);
    }

    // 三角形判断

    /**
     * 直角三角形 判断
     */
    boolean isRightTriangle() {
        // 已经规定了 a <= b <= c
        // 因此 c 一定会是斜边
        int aa = a * a;
        int bb = b * b;
        int cc = c * c;
        if (aa < 0 || bb < 0 || cc < 0) {
            throw new RuntimeException("运算错误，三边过大！");
        }
        return a * a + b * b == c * c;
    }

    // 三角形运算

    /**
     * 获取周长
     */
    int getPerimeter() {
        int perimeter = a + b + c;
        if (perimeter < 0) {
            throw new RuntimeException("运算错误，三边过大！");
        }
        return perimeter;
    }
}
