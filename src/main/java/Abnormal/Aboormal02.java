package Abnormal;


public class Aboormal02 {
    private String name;
    public Aboormal02(String name) throws yc
    {
        if(name=="王")          // 如果假执行下面并且抛出问题
        {
            throw new yc("不可以有王字这个数");
        }
        this.name=name;
        System.out.println(name);          // 如果真打印
    }
    public static void main(String[] args)
    {
        try {
            Aboormal02 h = new Aboormal02("王");
        }
        catch (Abnormal.yc yc) {
            yc.printStackTrace();
        }
    }
}

class yc extends Exception    //  异常类
{
    public yc(String name)   // String 与12行要打印的数有关如数字为int
    {
        System.out.println(name);
        System.out.println("就是规定不能打印王");            // 打印这个就是解决方案
    }
}
