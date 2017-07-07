package IP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Administrator on 2017/7/4 0004.
 */
public class TCP_02 {
    public static void main(String[] args) throws IOException {
        // 创建服务端对象
        ServerSocket ss = new ServerSocket(10003);

        // 获取链接发过来的服务端对象
        Socket s=ss.accept();

        // 获取本机ip地址
        String ip = s.getInetAddress().getHostAddress();

        // 通过Socket对象获取输入流，要读取客户发过来的数据
        InputStream is=s.getInputStream();
        byte [] y = new byte[1024];
        int read = is.read(y);
        String str = new String(y,0,read);
        System.out.println(ip+":"+str);

        OutputStream os= s.getOutputStream();
        os.write("收到".getBytes());

        // 关闭资源
        s.close();
        ss.close();
    }
}
