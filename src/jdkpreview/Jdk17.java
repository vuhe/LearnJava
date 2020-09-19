package jdkpreview;

public class Jdk17 {
    /**
     * 代码块
     */
    public void textBlock() {
        String html = """
                <h1>test</h1>
                <p>
                    <h2>ok</h2>
                </p>
                """;
        System.out.println(html);
    }

    /**
     * 类型测试
     *
     * @param o 一个可能是Object的类
     */
    public void instanceofTest(Object o) {
        if (o instanceof String s) {
            System.out.println(s);
        } else {
            System.out.println("Object is not a String");
        }
    }

    public void switchTest() {
        int num = (int)(Math.random() * 10) % 4;
        switch (num) {
            case 0, 1 -> System.out.println("The num is" + num);
            case 2, 3 -> System.out.println("Test num is Ok");
            default -> System.out.println("This is default");
        }
        num = switch (num) {
            case 0, 1 -> 0;
            case 2, 3 -> {
                int a = num % 2;
                System.out.println(a);
                yield a;
            }
            default -> -1;
        };
        System.out.println(num);
    }

    public static void recordTest() {
        Person p = new Person("you", 9);
        p.test();
    }
}

record Person(String name, int age){
    public void test() {
        System.out.println(name);
    }
}