package IP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by Administrator on 2017/7/4 0004.
 */
public class TCP_01 {
    public static void main(String[] args) throws IOException {
        // 客户端创建 Socket对象
        Socket socket = new Socket("127.0.0.1",10003);

        // 获取Socket对象的输出流
        OutputStream os = socket.getOutputStream();

        // 使用输出流将指定数据写出去
        os.write("快点去要饭 小黄人".getBytes());

        InputStream is=socket.getInputStream();
        byte[] x =new byte[1024];
        int len=is.read(x);
        String y = new String(x,0,len);
        System.out.println(y);


        // 关闭资源
        socket.close();
    }
}
