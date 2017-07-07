package IP;
import java.io.*;
import java.net.Socket;


/**
 * Created by Administrator on 2017/7/5 0005.
 */
public class TCP_03 {
    public static void main(String[] args) throws IOException {
        // Socket客户端
        Socket s =new Socket("127.0.0.1",10004);

        // 获取键盘录入
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Socket输出流
        PrintWriter pw = new PrintWriter(s.getOutputStream(),true);

        // Socket输入流
        BufferedReader bfr = new BufferedReader(new InputStreamReader(s.getInputStream()));

        // 写入
        String in =null;
        while ((in=br.readLine())!=null){
            if ("123".equals(in))
                break;
            pw.println(in);

            //打印服务端发的大写子母
            String y=bfr.readLine();
            System.out.println(y);
        }

        // 关闭资源
        s.close();
    }
}
