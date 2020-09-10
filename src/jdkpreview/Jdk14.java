package jdkpreview;

public class Jdk14 {
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
}

record Person(String name, int age){}