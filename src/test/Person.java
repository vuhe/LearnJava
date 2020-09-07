package test;

public class Person {
    private String name;
    private int age;
    private String school;
    private String major;

    // 调用另一个构造函数
    public Person(String name, int age) {
        this(name, age, "");
    }

    // 调用另一个构造函数
    public Person(String name, int age, String school) {
        this(name, age, school, "");
    }

    // 基本构造函数
    public Person(String name, int age, String school, String major) {
        this.name = name;
        this.age = age;
        this.school = school;
        this.major = major;
    }

    // 如果仅仅单打印一个对象的信息可以这么写
    public void showInfo() {
        System.out.println("name: " + this.name);
        System.out.println("age: " + this.age);
        System.out.println("school: " + this.school);
        System.out.println("major: " + this.major);
    }

    public static void showInfo(String... args) {
        for (String str : args) {
            System.out.println(str);
        }
    }

    /**
     * 此方法重载于Object
     * @return 本类的描述
     */
    @Override
    public String toString() {
        return "name: " + this.name + "\n" +
                "age: " + this.age + "\n" +
                "school: " + this.school + "\n" +
                "major: " + this.major;
    }

    public static void main(String[] args) {
        Person p1 = new Person("a", 1);
        Person p2 = new Person("a0", 12, "b");

        // 打印p1对象
        p1.showInfo();

        // 自动调用对象的toString()方法打印
        System.out.println(p2);

        Person.showInfo("b", 12 + "", "c");
        Person.showInfo("b", String.valueOf(13), "c");
    }
}
