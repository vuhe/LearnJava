package cn.ahut;

import cn.ahut.cn.userdefinelib.CDate;
import cn.ahut.cn.userdefinelib.Course;
import cn.ahut.cn.userdefinelib.Score;
import cn.ahut.cs.mainapp.CStudent;

public class EXA4_1 {
    public static void main(String[] args) {
        // 创建对象
        CDate date = new CDate(2000, 2, 2);
        CStudent stu = new CStudent("2018202002", "liming", date);
        // 打印信息
        System.out.println(stu);
//        // 设置日期
//        stu.getsDate().setDay(20);
//        // 打印信息
//        System.out.println(stu);
//
//        // 类变量
//        System.out.println("现有的学生有" + CStudent.getCount() + "个");
//        // 新建一个学生
//        stu = new CStudent("2018202003", "Arial", new CDate());
//        // 打印信息
//        System.out.println(stu);
//        // 打印学生数量
//        System.out.println("现有的学生有" + CStudent.getCount() + "个");
//
//        // 对象数组
//        System.out.println("\n对象数组");
//        // 学生数组
//        CStudent[] stus = new CStudent[2];
//        // 新建对象
//        stus[0] = new CStudent("2018202004", "Mark", new CDate(2000, 3, 3));
//        stus[1] = new CStudent("2018202005", "Angle", new CDate(2000, 5, 5));
//        // 打印信息
//        System.out.println(stus[0]);
//        System.out.println(stus[1]);
//        System.out.println("现有的学生有" + CStudent.getCount() + "个");

        System.out.println();

        Course course = new Course("Java", 30);// 3.0 -> 30
        Score score = new Score(stu, course, 70);// java 课程 70分
        System.out.println(score);
    }
}
