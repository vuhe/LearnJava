package cn.ahut.cn.userdefinelib;

/**
 * 日期类
 * 此类未对数据进行检验
 */
public class CDate {
    private int year;// 年
    private int month;// 月
    private int day;// 日

    // 默认构造函数
    public CDate() {
        this.year = 2020;
        this.month = 9;
        this.day = 1;
    }

    // 设置年月日的构造函数
    public CDate(int y, int m, int d) {
        this.year = y;
        this.month = m;
        this.day = d;
    }

    /*
    以下部分均为getter和setter，是对类中的数据进行设置和访问
     */

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    /*
    getter和setter完
     */

    /**
     * 字符串转换，此类输出「年月日」
     * @return this
     */
    @Override
    public String toString() {
        return year + "年" + month + "月" + day + "日";
    }
}
