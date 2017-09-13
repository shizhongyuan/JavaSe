package Fans;

/**
 * Created by Administrator on 2017/9/12 0012.
 */
public class Fan_02 {
    public static void main(String[] args) throws ClassNotFoundException {
        //    gesABC();   // 方法1
        //   gesABC01();  // 方法2
        gesABC02();    //方法3 重点
    }

    private static void gesABC02() throws ClassNotFoundException {
        String x = "Fans.Fan_01";  // 注意问题 路径
        Class clazz = Class.forName(x);
        System.out.println(clazz);
    }

    private static void gesABC01() {
        Class clazz = Fan_01.class;
        Class class01 = Fan_01.class;
        System.out.println(clazz==class01);
    }

    private static void gesABC() {
        Fan_01 p = new Fan_01();
        Class clazz = p.getClass();
         Fan_01 p1 = new Fan_01();
         Class clazz01 = p1.getClass();
        System.out.println(clazz == clazz01);
    }
}
