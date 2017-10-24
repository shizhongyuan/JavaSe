package sjb_java;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/10/12 0012.
 */
public class javav {
    public static void main(String[] args) {
        int [] arr={106,107,108,109};
        int []att={106,107,108,109};
        System.out.println("输入账号。。。");
        Scanner xx = new Scanner(System.in);
        int x = xx.nextInt();
        //int x=106;
        //String y="100";
        for (int i = 0; i < arr.length; i++) {
        if (x==arr[i])   {
            System.out.println("帐号正确，请输入密码。。。");
           Scanner yy = new Scanner(System.in);
            int y=yy.nextInt();
            for (int j = 0; j < att.length; j++) {
                if (y==att[j]){
                    System.out.println("成功。。。。");
                    break;
                }
                else
                    System.out.println("密码错误。。。");
                break;
            }
        }
        else
            System.out.println("账户错误。。。");
            break;
        }

    }
}
