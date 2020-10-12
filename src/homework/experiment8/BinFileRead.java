package homework.experiment8;

import java.io.*;

public class BinFileRead {
    public static void main(String[] args) throws Exception {
        // 写入信息
        writeFile();
        // 读取信息
        readFile();
    }

    public static void writeFile() {
        //try-resource 语句，自动关闭资源
        try (DataOutputStream dis = new DataOutputStream(
                new BufferedOutputStream(new FileOutputStream("./testcase/def.dat")))) {
            // 写入内容
            dis.writeUTF("test message");
            dis.writeInt(10);
            dis.writeInt(34);
            dis.writeUTF("test message2");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void readFile() {
        //try-resource 语句，自动关闭资源
        try (DataInputStream dis = new DataInputStream(
                new BufferedInputStream(new FileInputStream("./testcase/def.dat")))) {
            // 读取内容
            String a = dis.readUTF();
            int c = dis.readInt();
            int d = dis.readInt();
            String b = dis.readUTF();
            // 打印内容
            System.out.println("a: " + a);
            System.out.println("c: " + c);
            System.out.println("d: " + d);
            System.out.println("b: " + b);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
