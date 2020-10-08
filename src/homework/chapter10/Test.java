package homework.chapter10;

import java.util.Arrays;

class DivideZeroException extends ArithmeticException {
    private static final long serialVersionUID = 1563874058117161205L;

    public DivideZeroException() {}

    public DivideZeroException(String msg) {
        super(msg);
    }
}

public class Test {
    public static void main(String[] args) {
        int[] array = new int[5];
        Arrays.fill(array, 5);
        for (int i = 4; i > -1; i--) {
            if (i == 0) {
                throw new DivideZeroException("Divisor cannot be ZERO!");
            }
            System.out.println("array[ " + i + " ] / " + i + " = " + array[i] / i);
        }
    }
}
