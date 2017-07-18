package IP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Administrator on 2017/7/14 0014.
 */
public class TCP_08 {
    public static void main(String[] args) throws IOException {
        // 服务端创建
        ServerSocket ss = new ServerSocket(10006);
        // 获取客户端
        Socket s=ss.accept();
        // 获取IP
        String s1=s.getInetAddress().getHostAddress();
        System.out.println(s1+"----");
        // 获取客服端发来的数据
        InputStream is= s.getInputStream();
        // 如果文件不存在则创建
        File x = new File("E:\\java_io\\io");
        if (!x.exists()){
            x.mkdirs();
        }
        File y = new File(x,s1+".png");
        FileOutputStream fos = new FileOutputStream(y);

        byte [] arr = new byte[1024];
        int len = 0;
        while ((len=is.read(arr))!=-1){
            fos.write(arr,0,len);
        }
        OutputStream os = s.getOutputStream();
        os.write("上传成功".getBytes());
        s.close();
        ss.close();
        fos.close();
    }
}
