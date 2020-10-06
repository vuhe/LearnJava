package homework.chapter7;

interface ShapeArea {
    /**
     * 求一个形状的面积
     *
     * @return 面积
     */
    double getArea();

    /**
     * 求一个形状的周长
     *
     * @return 周长
     */
    double getPerimeter();
}

class MyTriangle implements ShapeArea {
    private final double x;
    private final double y;
    private final double z;

    /**
     * 构造函数，给三条边和s赋初值
     *
     * @param x x
     * @param y y
     * @param z z
     */
    public MyTriangle(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public double getArea() {
        // 海伦公式，别问我为啥这样算
        // 高中就是这么教的，我也不知道为啥
        double p = (x + y + z) / 2;
        return Math.sqrt(p * (p - x) * (p - y) * (p - z));
    }

    @Override
    public double getPerimeter() {
        return x + y + z;
    }

    // 输出矩形的描述信息
    @Override
    public String toString() {
        return "MyTriangle{" +
                "\n" +
                "\tthree sides: " +
                String.format(" %.1f,", x) +
                String.format(" %.1f,", y) +
                String.format(" %.1f%n", z) +
                "\tperimeter = " +
                String.format(" %.1f%n", getPerimeter()) +
                "\tarea = " +
                String.format(" %.1f}", getArea());
    }
}

public class Test {
    public static void main(String[] args) {
        MyTriangle triangle = new MyTriangle(3, 4, 5);
        System.out.println(triangle);
    }
}
