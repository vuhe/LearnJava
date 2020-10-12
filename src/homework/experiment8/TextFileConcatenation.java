package homework.experiment8;

import java.io.*;

public class TextFileConcatenation {
    public static void main(String[] args) {
        // 设定根目录
        File root = new File("./testcase");
        // 获得此目录下的 txt 文件
        // 此部分使用了 lambda 表达式，需要环境 jdk8+
        File[] textFiles = root.listFiles(
                (File pathname) -> pathname.getName().endsWith(".txt"));
        // 此部分打开资源需要使用 jdk7+
        try (FileWriter fw = new FileWriter("./testcase/concatenation.txt")) {
            // 判断刚刚获得的文件数组不为 null
            if (textFiles != null) {
                // 变量 textFiles
                for (File txtFile : textFiles) {
                    // 此部分打开资源需要使用 jdk7+
                    try (BufferedReader br = new BufferedReader(new FileReader(txtFile))) {
                        String line;
                        // 循环写入到刚刚新建的文件
                        while ((line = br.readLine()) != null) {
                            fw.write(line);
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
