package IP;

import java.io.IOException;
import java.net.*;

/**
 * Created by Administrator on 2017/7/3 0003.
 */
public class UDP_01 {
    public static void main(String[] args) throws IOException {
        System.out.println("发送端启动---");
        // 使用DatagramSocket对象    发送端
        DatagramSocket ds = new DatagramSocket();
        // 要发的字符串
        String x = "小黄人吃宝吃冰淇淋 嘻嘻";
        byte [] atn = x.getBytes();
        // 使用DatagramPacket对象封装该对象包中
        DatagramPacket dp = new DatagramPacket(atn,atn.length,InetAddress.getByName("127.0.0.1"),10086);
        //  使用该方法发送出去
        ds.send(dp);
        // 关闭资源
        ds.close();
    }
}
