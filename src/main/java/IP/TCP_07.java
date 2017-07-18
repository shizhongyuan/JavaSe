package IP;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by Administrator on 2017/7/14 0014.
 */
public class TCP_07 {
    public static void main(String[] args) throws IOException {
        // 上传图片 客户端

        Socket s = new Socket("127.0.0.1",10006);
        // 读取图片
        FileInputStream fis = new FileInputStream("E:\\java_io\\123.png");
        // 获取Socket输出流 将数据发给服务端
        OutputStream os = s.getOutputStream();

        byte [] io = new byte[1024];
        int len = 0;
        while ((len=fis.read())!=-1){
            os.write(io,0,len);
        }
        s.shutdownOutput();

        // 读取服务端发来的内容
        InputStream is = s.getInputStream();
        byte [] iop = new byte[1024];
        int read = is.read(io);
        String texe = new String(io,0,read);
        System.out.println(texe);

        fis.close();
        s.close();
    }
}
