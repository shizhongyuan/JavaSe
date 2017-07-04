package Io_RAF;

import java.io.UnsupportedEncodingException;

/**
 * Created by Administrator on 2017/7/2 0002.
 */
public class JmBm {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String x ="sb小黄";
        int gbk = x.getBytes("gbk").length;
        for (int i = 0; i <gbk ; i++) {
            System.out.println("取"+(i+1)+"个字节是"+Jmbm(x,i+1));
        }
//        Jmbm();
    }

    public static String Jmbm(String str, int len) throws UnsupportedEncodingException {
        // 编码解码
        byte[] ax =str.getBytes("gbk");
        int y = 0;
        for (int i = len-1; i >=0 ; i--) {
            if (ax[i]<0)
                y++;
            else
                break;
        }
        if (y%2==0) {
            return new String(ax, 0, len, "gbk");
        }
        else
            return new String(ax,0,len-1,"gbk");
    }
}
