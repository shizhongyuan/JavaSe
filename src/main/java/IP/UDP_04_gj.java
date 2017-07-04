package IP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Created by Administrator on 2017/7/4 0004.
 */
public class UDP_04_gj {
    public static void main(String[] args) throws IOException {
        System.out.println("接收端启动---");
        while (true) {
            // 使用DatagramSocket对象
            DatagramSocket ds = new DatagramSocket(10086);
            // 创建数据包
            byte[] y = new byte[1024];
            DatagramPacket dp = new DatagramPacket(y, y.length);
            // 将数据储存到数据包中
            ds.receive(dp);
            // 通过数据包解析数据 比如 地址 端口 数据内容
//        String ha = ds.getInetAddress().getHostAddress();
            int gp = ds.getPort();
            String s = new String(dp.getData(), 0, dp.getLength());
            System.out.println("==" + gp + ":" + s);
            // 关闭资源
//            ds.close();
        }
    }
}
