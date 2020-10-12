package homework.experiment8;

import java.io.File;
import java.io.IOException;

public class Question1 {
    public static void main(String[] args) {
        // 输入路径
        File d = new File("~/development/temp");
        if (!d.exists()) {
            // 若路径不存在，新建文件夹
            d.mkdirs();
        }
        // 测试打印信息
        System.out.println("Is d directory? " + d.isDirectory());
        // 输入路径
        File f = new File("~/development/temp/abc.txt");
        // 若路径不存在
        if (!f.exists()) {
            try {
                // 新建文件
                f.createNewFile();
            } catch (IOException e) { //可能会因为权限不足或磁盘已满报错
                e.printStackTrace();
            }
        }
        // 打印测试内容
        System.out.println("Is f file? " + f.isFile());
        System.out.println("Name: " + f.getName());
        System.out.println("Parent: " + f.getParent());
        System.out.println("Path: " + f.getPath());
        System.out.println("Size: " + f.length() + " bytes");
        System.out.println("Last modified time: " + f.lastModified() + "ms");
        // 遍历文件夹
        System.out.println("list files in d directory");
        File[] fs = d.listFiles();
        for (File f1 : fs) {
            System.out.println(f1.getPath());
        }
        // 删除文件和文件夹
        f.delete();
        d.delete();
    }
}
