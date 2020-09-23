package cn.ahut.cn.userdefinelib;

import cn.ahut.cs.mainapp.CStudent;

public class Score {
    private final CStudent student;
    private final Course course;
    private int score;// 分数，不取分数仅取整数

    /**
     * 成绩变量中的学生和课程不允许更换
     * 分数可以更改
     * @param student 学生信息
     * @param course 课程信息
     * @param score 分数
     */
    public Score(CStudent student, Course course, int score) {
        this.course = course;
        this.student = student;
        this.score = score;
    }

    /*
    以下部分均为getter和setter，是对类中的数据进行设置和访问
     */

    /**
     * 重设分数
     * @param score 新分数
     */
    public void setScore(int score) {
        this.score = score;
    }

    /*
    getter和setter完
     */

    @Override
    public String toString() {
        return student.getsName() + " 的 " + course.toString() + " 课程\n"
                + "成绩为 " + score;
    }
}
