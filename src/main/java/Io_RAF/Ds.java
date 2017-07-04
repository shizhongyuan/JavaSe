package Io_RAF;


import java.io.*;

/**
 * Created by Administrator on 2017/6/30 0030.
 */
public class Ds {
    public static void main(String[] args) throws IOException {
//        Io_x();
        Io_d();
    }

    public static void Io_d() throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("E:\\java_io\\io12.xex")); // 简单的读
        String s = dis.readUTF();
        System.out.println(s);
    }

    public static void Io_x() throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("E:\\java_io\\io12.xex"));    // 简单的写
        dos.writeUTF("小黄人快要饭");         // 操作基本数据类型用
        dos.close();
    }
}
