package IP;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Administrator on 2017/7/3 0003.
 */
public class ip_1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ip = InetAddress.getLocalHost();
        String ha = ip.getHostAddress();// 获取本机ip地址
        String hn = ip.getHostName();// 获取本机名

        ip=InetAddress.getByName("www.baidu.com");          // 获取百度的ip地址和百度名
        System.out.println(ip.getHostAddress());
        System.out.println(ip.getHostName());
        System.out.println("----------------------------");

        System.out.println("ip地址"+ha+"\r\n"+"本机名"+hn);
    }
}
