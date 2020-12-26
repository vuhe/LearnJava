package socket;

import java.io.*;
import java.net.Socket;

/**
 * @author vuhe
 */
public class Client {
    private static void log(String message) {
        System.out.println("client : " + message);
    }

    public static void main(String[] args) {
        try {
            Socket s = new Socket("127.0.0.1", 8888);

            //构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
            //向服务器端发送一条消息
            bw.write("测试数据\n");
            bw.flush();

            //读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess;
            while (!"end".equals(mess = br.readLine())) {
                log("读取数据为 " + mess);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
