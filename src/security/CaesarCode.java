package security;

/**
 * @author zhuhe
 */
public class CaesarCode {
    private static int key = 5;
    private static String testStr = "Hello world!";

    public static void main(String[] args) {
        System.out.println("key: " + key);
        System.out.println("明文: " + testStr);
        String code = encode(testStr);
        System.out.println("密文: " + code);
        System.out.println("解密: " + decode(code));
    }

    public static String encode(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                int c = ch - 'A' + 26 + key;
                ch = (char) (c % 26 + 'A');
            } else if (Character.isLowerCase(ch)) {
                int c = ch - 'a' + 26 + key;
                ch = (char) (c % 26 + 'a');
            }
            sb.append(ch);
        }
        return sb.toString();
    }

    public static String decode(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                int c = ch - 'A' + 26 - key;
                ch = (char) (c % 26 + 'A');
            } else if (Character.isLowerCase(ch)) {
                int c = ch - 'a' + 26 - key;
                ch = (char) (c % 26 + 'a');
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}
