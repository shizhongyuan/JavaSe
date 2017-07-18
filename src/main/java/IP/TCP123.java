package IP;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Administrator on 2017/7/15 0015.
 */
public class TCP123 {
    public static void main(String[] args) throws IOException {
        // 浏览器的创建 如启动服务端 在浏览器上打入127.0.0.1：9090则会显示下面的信息
        ServerSocket ss = new ServerSocket(9090);
        Socket s =ss.accept();
        System.out.println(s.getInetAddress().getHostAddress()+"------");
        InputStream is = s.getInputStream();
        byte [] io = new byte[1024];
        int x = is.read(io);
        String y = new String(io,0,x);
        System.out.println(y);

        PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
        pw.println("1008611");
        s.close();
        ss.close();
    }
}
