package Io_RAF;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Raf {
    public static void main(String[] args) throws IOException {
//        Raf_x();        // 写入
        Raf_d();        // 读出
    }



    public static void Raf_x() throws IOException {
        RandomAccessFile raf = new RandomAccessFile("E:\\java_io\\io11.xex","rw");   // 写入位置

        raf.write("小强".getBytes());
        raf.writeInt((char)(97));
        raf.write("小红".getBytes());
        raf.writeInt((char)(98));
        raf.close();
    }

    public static void Raf_d() throws IOException {
        RandomAccessFile raf = new RandomAccessFile("E:\\java_io\\io11.xex","r");

        raf.seek(1*8);      // 读取的位置        注读取和写入都可用这个方法
        byte []  a = new byte[4];
        raf.read(a);
        String y = new String(a);
        int i = raf.readInt();
        System.out.println("y="+y);
        System.out.println("i="+i);
        raf.close();
    }
}
