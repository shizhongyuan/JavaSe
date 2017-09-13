package Fans;

import java.io.File;
import java.lang.reflect.Field;

/**
 * Created by Administrator on 2017/9/13 0013.
 */
public class Fan_04 {
    public static void main(String[] args) throws Exception {
        mxa();              // Class中的字段
    }

    private static void mxa() throws Exception {
        Class clazz = Class.forName( "Fans.Fan_01");
        Field fi = null;        // 只能获取公有的
        fi = clazz.getDeclaredField("sen");     // 只获取本类 但包含私有
        fi.setAccessible(true);             // 对私有字段的访问取消限权检查
        Object o = clazz.newInstance();

        Object o1 = fi.get(o);
        System.out.println(o);
    }
}
