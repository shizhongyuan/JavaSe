package Abnormal;
import java.util.Scanner;

public class Abnormal01 {
    public static void main(String[] agrs){
        int x = 0;      // 循环次数
        Scanner sc = new Scanner(System.in);
        int xx;         // 随机生成的数
        xx=(int)(Math.random()*100)+1;
        while (true){
            System.out.println("请输入你猜的数：");
            x++;
            int xb = sc.nextInt();      // 使用者输入的数

            if (xb>xx){
                System.out.println("偏大啦 继续加油");
            }
           else if(xb<xx){
                System.out.println("偏小啦 继续加油");
            }
            else {
                System.out.println("对啦 恭喜");
                System.out.println("你一共猜了"+x+"次");
                break;
            }
        }

    }
}
