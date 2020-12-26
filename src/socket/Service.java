package socket;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author vuhe
 */
public class Service {
    private static void log(String message) {
        System.out.println("service : " + message);
    }

    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8888);
            log("启动服务器....");
            System.out.println();
            Socket s = ss.accept();
            s.getInetAddress();
            log(InetAddress.getLocalHost() + "已连接到服务器");

            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            //读取客户端发送来的消息
            String mess = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bw.write(mess + "\nend\n");

            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
