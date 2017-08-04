package ZhangMi;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/4 0004.
 */
public class ZhanghaoMima {
    public static void main(String[] args) {
        System.out.println("请输入帐号：");
        Scanner sc = new Scanner(System.in);
        int zh = sc.nextInt();
        if (zh == 1067164628) {
                System.out.println("帐号正确，请输入密码:");
                Scanner xx = new Scanner(System.in);
                int x = xx.nextInt();
                if (x == 123456) {
                    l2();
                } else {
                   oo();
                }
            }
            else {
                System.out.println("帐号不对，请再输入：");
                System.out.println("还有1次机会");
                new ZhanghaoMima();
        }
    }
    public ZhanghaoMima(){
        System.out.println("请输入帐号：");
        Scanner sc = new Scanner(System.in);
        int zh = sc.nextInt();
        if (zh == 1067164628) {
            System.out.println("帐号正确，请输入密码:");
            Scanner qq = new Scanner(System.in);
            int q = sc.nextInt();
            if (q==123456){
                l2();
            }
            else {
                oo();
            }
        }
        else {
            System.out.println("帐号不对今天机会用完，谢谢使用");
        }
    }
    public static void oo(){
        System.out.println("密码不对，请再输入：");
        System.out.println("还有1次机会");
        xiao();
    }
    public static void xiao(){
        System.out.println("请输入密码：");
        Scanner xx = new Scanner(System.in);
        int x = xx.nextInt();
        if (x == 123456) {
           l2();
        }
        else {
            System.out.println("密码不对今天机会用完，谢谢使用");
        }
    }
    public static void l2(){
        System.out.println("登入成功");
    }
}
