package Zz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2017/9/15 0015.
 */
public class Zz_tih {
    public static void main(String[] args) {
        //tihuan();  // 替换

        huoq();
    }

    private static void huoq() {
        String xx = "xiao jia msj ,da zhu";
        String x = "\\b[a-z]{3}\\b";
        // 将正则封装成对象
        Pattern p = Pattern.compile(x);
        // 获取匹配器对象
        Matcher m = p.matcher(xx);
        while (m.find()){
            System.out.println(m.group());
        }
    }

    private static void tihuan() {
        // 需求  对字符串的重复相连的字母进行去掉留下一个
        String x= "xiaowangooooooxaiokjiiiiiiiguashumei";
        x = x.replaceAll("(.)\\1+", "$1");
        System.out.println(x);
    }
}
