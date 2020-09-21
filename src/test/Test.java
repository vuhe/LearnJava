// 包名
package test;

// 类名
public class Test {
    // 主函数
    public static void main(String[] args) {
        // 样例数据
        String string = "This is Smith family's tickets";

        // 预处理数据
        StringBuilder sb = new StringBuilder(string);

        // (1) 统计该字符串中字母s出现的次数
        int sNum = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (Character.toLowerCase(sb.charAt(i)) == 's') {
                sNum++;
            }
        }
        System.out.println("Character (s) number is " + sNum);

        // (2) 取出子字符串 “Smith”
        System.out.println(sb.substring(8, 13));

        // (3) 用多种方式将本字符串复制到一个字符数组 char[] str 中
        char[] str;
        str = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            str[i] = string.charAt(i);
        }
        System.out.println("(3) no output");

        // (4) 将字符串中每个单词的第一个字母变成大写，输出到控制台
        String[] ans = string.split(" ");
        StringBuilder sb1 = new StringBuilder();
        for (String s : ans) {
            sb1.append(Character.toUpperCase(s.charAt(0)));
            for (int i = 1; i < s.length(); i++) {
                sb1.append(s.charAt(i));
            }
            sb1.append(" ");
        }
        sb1.deleteCharAt(sb1.length() - 1);
        System.out.println(sb1);

        // (5) 实现该字符串的逆序输出
        System.out.println(sb.reverse());
    }
}
