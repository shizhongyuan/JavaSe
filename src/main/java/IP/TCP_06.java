package IP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Administrator on 2017/7/6 0006.
 */
public class TCP_06 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss =new ServerSocket(10005);

        Socket s =ss.accept();

        System.out.println(s.getInetAddress().getHostAddress()+"===");

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        BufferedWriter bw =new BufferedWriter(new FileWriter("E:\\java_io\\io12.xex"));

        String x = null;
        while ((x=br.readLine())!=null){
//            if ("123".equals(x))
//                break;
            bw.write(x);
            bw.newLine();
            bw.flush();
        }

        PrintWriter pw =new PrintWriter(s.getOutputStream());
        pw.println("上传成功");

        s.close();
        ss.close();
        bw.close();
    }
}
