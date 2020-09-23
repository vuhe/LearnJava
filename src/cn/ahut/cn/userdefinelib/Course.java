package cn.ahut.cn.userdefinelib;

public class Course {
    private final String name;
    private final int n; // 学分，两位记录即2.0 -> 20

    /**
     * 初始化必须传入参数
     * @param name 课程名
     * @param n 学分
     */
    public Course(String name, int n) {
        this.name = name;
        this.n = n;
    }

    @Override
    public String toString() {
        return name + " (" + n / 10 + "." + n % 10 + ")";
    }
}
