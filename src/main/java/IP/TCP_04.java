package IP;
import java.io.*;
import java.net.*;

/**
 * Created by Administrator on 2017/7/5 0005.
 */
public class TCP_04 {
    public static void main(String[] args) throws IOException {
        // ServerSocket服务端
        ServerSocket ss = new ServerSocket(10004);

        // Socket对象
        Socket s =ss.accept();

        // 获取ip
        String h = s.getInetAddress().getHostName();
        System.out.println(h+"===");

        // Socket读取流
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        // Socket输出流
        PrintWriter pw =new PrintWriter(s.getOutputStream(),true);

        String x=null;
        while ((x=br.readLine())!=null){
            System.out.println(x);
            pw.println(x.toUpperCase());
        }

        // 关闭资源
        s.close();
        ss.close();
    }
}
