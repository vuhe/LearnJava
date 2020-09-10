// 包名
package test;

// 类名
public class Test {
    // 主函数
    public static void main(String[] args) {
        int number1 = 12;// 定义第一个变量
        int number2 = 21;// 定义第二个变量
        System.out.println("交换前：number1 = " + number1 + ", number2 = " + number2);
        int tmp = number1;
        number1 = number2;
        number2 = tmp;
        System.out.println("交换后：number1 = " + number1 + ", number2 = " + number2);
        char ch = '\uabcd';
        System.out.println(ch);
    }
}
