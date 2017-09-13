package Fans;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/9/13 0013.
 */
public class Fan_05 {
    public static void main(String[] args) throws Exception {
       // max();      // Class的方法   无参
         max01();       // Class的方法   有参
    }

    private static void max01() throws Exception {
        Class clazz = Class.forName("Fans.Fan_01");     // 选择路径
        Method m = clazz.getMethod("shuo02",int.class,String.class);
        Object obj = clazz.newInstance();
        // 不懂怎么给值
        m.invoke(obj,99,"徒弟");
    }

    private static void max() throws Exception {
        Class clazz = Class.forName("Fans.Fan_01");
        Method m = clazz.getMethod("shuo",null);      // 获取倥参的一般方法
        // Object ojb= clazz.newInstance();
        Constructor comparable = clazz.getConstructor(int.class,String.class);
        Object obj = comparable.newInstance(38,"小石");   // 给定值
        m.invoke(obj,null);
    }
}
