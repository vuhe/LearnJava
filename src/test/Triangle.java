package test;

/**
 * 三角形
 * 默认三个点为原点，同时此类不对点进行三角形的合法检验
 */
public class Triangle {
    // 三个点默认为原点
    private final Point p1 = new Point();
    private final Point p2 = new Point();
    private final Point p3 = new Point();

    public Triangle() {
        // 测试数据(0, 0)、(0, 3)、(4, 0)
        setTri(0, 0, 0, 3, 4, 0);
    }

    public static void main(String[] args) {
        Triangle t = new Triangle();
        System.out.println(t);
        System.out.printf("The perimeter is %.1f%n", t.getPerimeter());
        System.out.printf("The area is %.1f%n", t.getArea());
    }

    public double getPerimeter() {
        // 三条边和
        return p1.lengthTo(p2) + p2.lengthTo(p3) + p3.lengthTo(p1);
    }

    public double getArea() {
        // 三边长
        double a = p1.lengthTo(p2);
        double b = p2.lengthTo(p3);
        double c = p3.lengthTo(p1);
        // 海伦公式，别问我为啥这样算
        // 高中就是这么教的，我也不知道为啥
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public void setTri(int x1, int y1, int x2, int y2, int x3, int y3) {
        p1.reset(x1, y1);
        p2.reset(x2, y2);
        p3.reset(x3, y3);
    }

    @Override
    public String toString() {
        return "Triangle[" + p1 + "," + p2
                + "," + p3 + "]";
    }
}

/**
 * 点，坐标
 * 此类未对大数进行优化，请谨慎使用
 */
class Point {
    private int x = 0;
    private int y = 0;

    /**
     * 默认为原点
     */
    public Point() {
    }

    /**
     * 自定义一个点
     *
     * @param x x
     * @param y y
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * 重设点坐标
     *
     * @param x x
     * @param y y
     */
    public void reset(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * 和另一个点求长度
     *
     * @param p 其他点
     * @return 边长
     */
    public double lengthTo(Point p) {
        // 勾股定理
        long xLen = Math.abs(p.x - this.x);
        long yLen = Math.abs(p.y - this.y);
        return Math.sqrt(Math.pow(xLen, 2) + Math.pow(yLen, 2));
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}