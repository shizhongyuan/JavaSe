package Abnormal;

/**
 * Created by Administrator on 2017/4/12 0012.
 */
public class yc02 {
    public static void main(String[]args){
        try {
            yc02 yc02=new yc02("出");
        } catch (Abnormal.yc00 yc00) {
            yc00.printStackTrace();
        }
    }
    private String xx;
    yc02(String xx) throws yc00 {
        if (xx=="出"){
            throw new yc00("出事啦");
        }
        this.xx=xx;
        System.out.println("正常工作");
    }
}

class yc00 extends Exception {
    public yc00(String qq){
        System.out.println(qq);
        System.out.println("拿去修复");
    }
}