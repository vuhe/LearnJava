package homework.chapter10;

import java.util.Arrays;

/**
 * 自定义异常类
 */
class DivideZeroException extends ArithmeticException {
    private static final long serialVersionUID = 1563874058117161205L;

    /**
     * 实现默认构造方法
     */
    public DivideZeroException() {
    }

    /**
     * 实现有输出信息的构造方法
     *
     * @param msg 错误信息
     */
    public DivideZeroException(String msg) {
        super(msg);
    }
}

public class Test {
    public static void main(String[] args) {
        // 定义长度为 5 的数组
        int[] array = new int[5];
        // 将数组中的元素赋值为5
        Arrays.fill(array, 5);
        // 遍历整个数组
        for (int i = 4; i > -1; i--) {
            // 如果除0
            if (i == 0) {
                // 如果除0就抛出有异常信息的构造方法
                throw new DivideZeroException("Divisor cannot be ZERO!");
            }
            // 如果不是除0就输出结果
            System.out.println("array[ " + i + " ] / " + i + " = " + array[i] / i);
        }
    }
}
