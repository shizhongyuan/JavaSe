package IP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * Created by Administrator on 2017/7/4 0004.
 */
public class UDP_03_gj {
    public static void main(String[] args) throws IOException {
        System.out.println("发送端启动---");
        // 使用DatagramSocket对象    发送端
        DatagramSocket ds = new DatagramSocket();
        // 要发的字符串
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = null;
        while ((n=br.readLine())!=null) {
            byte[] atn = n.getBytes();
            // 使用DatagramPacket对象封装该对象包中
            DatagramPacket dp = new DatagramPacket(atn, atn.length, InetAddress.getByName("127.0.0.1"), 10086);
            //  使用该方法发送出去
            ds.send(dp);
            if ("886".equals(n))
                break;
        }
        // 关闭资源
        ds.close();
    }
}
