package IP;

import java.io.*;
import java.net.Socket;

/**
 * Created by Administrator on 2017/7/6 0006.
 */
public class TCP_05 {
    public static void main(String[] args) throws IOException {
        File f = new File("E:\\java_io\\io11.xex");
        System.out.println(f.exists());

        Socket s =new Socket("127.0.0.1",10005);
        BufferedReader br =new BufferedReader(new FileReader(f));
        PrintWriter pw = new PrintWriter(s.getOutputStream());
        String x = null;
        while ((x=br.readLine())!=null){
            pw.println(x);
        }
            s.shutdownOutput();

        BufferedReader bfr = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String s1 = bfr.readLine();
        System.out.println(s1);

        br.close();
        s.close();
    }
}
