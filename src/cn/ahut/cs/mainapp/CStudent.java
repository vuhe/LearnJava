package cn.ahut.cs.mainapp;

import cn.ahut.cn.userdefinelib.CDate;

/**
 * 学生类
 * 此类未对信息进行检验
 */
public class CStudent {
    private String sNo;// 学号
    private String sName;// 姓名
    private CDate sDate;// 日期
    private static int count;// 学生计数

    // 默认构造函数
    public CStudent() {
        this.sNo = "201820201";
        this.sName = "安妮";
        this.sDate = new CDate();
        count++;
    }

    // 自定义数据的构造函数
    public CStudent(String no, String name, CDate date) {
        this.sNo = no;
        this.sName = name;
        this.sDate = date;
        count++;
    }

    /*
    以下部分均为getter和setter，是对类中的数据进行设置和访问
     */

    public String getsNo() {
        return sNo;
    }

    public static int getCount() {
        return count;
    }

    public CDate getsDate() {
        return sDate;
    }

    public String getsName() {
        return sName;
    }

    public void setsNo(String sNo) {
        this.sNo = sNo;
    }

    /*
    getter和setter完
     */

    /**
     * 字符串转换，此类输出「学生信息」
     * @return this
     */
    @Override
    public String toString() {
        return "学生：" + sName + "\n学号：" + sNo + "\n出生日期：" + sDate;
    }
}
