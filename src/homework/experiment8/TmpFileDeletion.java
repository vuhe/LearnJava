package homework.experiment8;

import java.io.File;

public class TmpFileDeletion {
    private static void deleteTmpFile(File temFile) {
        // 获取文件名
        String name = temFile.getName();
        // 文件名匹配删除
        if (name.endsWith(".tmp") || name.endsWith(".TMP")) {
            temFile.delete();
        }
    }

    public static void deleteTmpFiles(File root) {
        // 如果是文件夹
        if (root.isDirectory()) {
            // 获取全部的子文件（夹）
            File[] files = root.listFiles();
            if (files == null) {
                files = new File[0];
            }
            // 遍历删除
            for (File file : files) {
                // 文件夹递归
                if (file.isDirectory()) {
                    deleteTmpFiles(file);
                }
                // 文件检测删除
                if (file.isFile()) {
                    deleteTmpFile(file);
                }
            }
        }
        // 文件检测删除
        if (root.isFile()) {
            deleteTmpFile(root);
        }
    }

    public static void main(String[] args) {
        // 设定根目录
        File root = new File("./testcase");
        // 调用
        deleteTmpFiles(root);
    }
}
