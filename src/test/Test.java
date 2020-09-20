// 包名
package test;

import java.util.Scanner;

// 类名
public class Test {
    // 主函数
    public static void main(String[] args) {
        // 编号
        int[] people = new int[10];
        // 输入
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while ((num = scanner.nextInt()) != -1) {
            // 计数
            people[num]++;
        }
        // 循环输出
        for (int i : people) {
            System.out.print(i + " ");
        }
    }
}
