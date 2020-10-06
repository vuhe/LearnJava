package homework.chapter7;

class Person {
    protected String name;
    protected SEX sex;
    protected String id;
    protected String phone;
    protected String email;

    /**
     * 定义构造方法
     *
     * @param name 姓名
     * @param sex  性别
     * @param id   身份证号
     */
    Person(String name, SEX sex, String id) {
        this.name = name;
        this.sex = sex;
        this.id = id;
    }

    public enum SEX {
        MAN() {
            @Override
            public String toString() {
                return "男";
            }
        },
        WOMAN() {
            @Override
            public String toString() {
                return "女";
            }
        }
    }

    /*
    以下为 getter 以及 toString 方法
     */

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("\n\t 姓名: ")
                .append(name)
                .append("\n\t 性别: ")
                .append(sex);
        if (id != null) {
            s.append("\n\t 身份证号: ").append(id);
        }
        if (phone != null) {
            s.append("\n\t 联系电话: ").append(phone);
        }
        if (email != null) {
            s.append("\n\t 联系email: ").append(email);
        }
        return s.toString();
    }
}

class Student extends Person {
    //定义属性
    private long sNo;
    private String sClass;

    /**
     * 定义构造方法
     *
     * @param sNo  学号
     * @param name 姓名
     * @param sex  性别
     * @param id   身份证号
     */
    Student(long sNo, String name, SEX sex, String id) {
        super(name, sex, id);
        this.sNo = sNo;
    }

    /*
    以下为 getter 以及 toString 方法
     */

    public void setsClass(String sClass) {
        this.sClass = sClass;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("\n\t 姓名: ")
                .append(name)
                .append("\n\t 性别: ")
                .append(sex)
                .append("\n\t 学号：")
                .append(sNo);
        if (sClass != null) {
            s.append("\n\t 班级：").append(sClass);
        }
        if (id != null) {
            s.append("\n\t 身份证号: ").append(id);
        }
        if (phone != null) {
            s.append("\n\t 联系电话: ").append(phone);
        }
        if (email != null) {
            s.append("\n\t 联系email: ").append(email);
        }
        return s.toString();
    }
}

public class TestStudent {
    public static void main(String[] args) {
        Student aStudent = new Student(2004001, "王非", Person.SEX.WOMAN, "2202198506070222");
        aStudent.setPhone("88078549");
        aStudent.setEmail("wangfei@zjtvu.edu.cn");
        System.out.println("student info: " + aStudent);
    }
}

