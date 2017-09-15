package Zz;

/**
 * Created by Administrator on 2017/9/13 0013.
 */
public class Zz_01 {
    public static void main(String[] args) {
        // 需求 对数字进行规定第一个数不可以为0 长度不可以超过8个不少于3个
        String x = "1230345";

        String y ="[1-9][0-9]{2,7}";        // 意思是第一为1到9 后面为0到9  第2位到第7位
        boolean oo = x.matches(y);
        System.out.println(x+":"+oo);
    }
}
