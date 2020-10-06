package homework.chapter7;

/**
 * 抽象类定义
 */
abstract class Shape{
}

class MyCircle extends Shape {
    private static final double PI=Math.PI;
    private final double radius;

    /**
     * 构造函数定义
     * @param r 圆半径
     */
    public MyCircle(double r) {
        this.radius = r;
    }

    /*
    以下为 getter 以及 toString 方法
     */
    public double getPerimeter() {
        return PI * 2 * radius;
    }
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public String toString() {
        return "MyCircle{" +
                "radius = " +
                String.format("%.1f", radius) +
                ",\n\tperimeter = " +
                String.format("%.2f", getPerimeter()) +
                ", area = " +
                String.format("%.2f", getArea()) +
                '}';
    }
}

public class Test2 {
    public static void main(String[] args) {
        MyCircle circle = new MyCircle(1.0);
        System.out.println(circle.toString());
    }
}
