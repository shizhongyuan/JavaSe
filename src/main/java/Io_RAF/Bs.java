package Io_RAF;



import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * Created by Administrator on 2017/7/1 0001.
 */
public class Bs {
    public static void main(String[] args) {        // 操作数组的流
        ByteArrayInputStream bis = new ByteArrayInputStream("小人".getBytes());
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        int ch = 0;
        while ((ch=bis.read())!=-1){
            bos.write(ch);
        }
        String s = bos.toString();
        System.out.println("你:"+s);
    }
}
