package Zz;

/**
 * Created by Administrator on 2017/9/14 0014.
 */
public class Zz_pip {
    public static void main(String[] args) {
       // pip();  // 正切表达式的匹配

        // qge();   // 切隔的简单形式
        qge01();     // 切隔的加深形式
    }

    private static void qge01() {
        String x = "xiaowangooooooxaiokjiiiiiiiguashumei";  //把xiaowang  xaiokj  guashumei 切出来
        String [] y = x.split("(.)\\1+");       // 意思是相同的字母2个或多个为切隔点
        for (String xx:y){
            System.out.println(xx);
        }
    }

    private static void qge() {
        // 之前用的切割方法
        String x = "xiaowang xaioshi huangr";  //  如果切的时候空格太多则下面要加+  则下面为" +"
        String [] y =x.split(" ");         // 如果是，为切隔  则因为该符号为转义字符 则要为//， 才行
        for (String xx:y){
            System.out.println(xx);
        }
    }

    public static void pip(){
        // 需求 电话号码开头为1 第2个必须为3，5，8 后面的还有9位数0到9都可以
        String x = "15978217307";
        String y ="1[358]\\d{9}";   // 注\\d 可以换为[0-9] 意思一样
        boolean p = x.matches(y);
        System.out.println(x+":"+p);
    }
}
