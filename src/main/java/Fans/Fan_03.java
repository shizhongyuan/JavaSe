package Fans;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;

/**
 * Created by Administrator on 2017/9/12 0012.
 */
public class Fan_03 {
    public static void main(String[] args) throws Exception {
        // Fan01(); // Class构造函数 方法1 简单
        Fan02();
    }

    private static void Fan02() throws Exception {
        Fans.Fan_01 p2 = new  Fans.Fan_01(20,"小强");
        // 或者下面的方法
        String p3 = " Fans.Fan_01";
        Class clazz = Class.forName(p3);
        Constructor comparator = clazz.getConstructor(int.class,String.class);
        Object oj01 = comparator.newInstance(22,"小五");
    }

    private static void Fan01() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Fans.Fan_01 p = new Fans.Fan_01();
        // 或者下面的方法
        String p1 = " Fans.Fan_01";
        Class clazz = Class.forName(p1);
        Object oj = clazz.newInstance();
    }
}
