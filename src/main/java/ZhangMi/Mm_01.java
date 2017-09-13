package ZhangMi;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2017/8/7 0007.
 */
public class Mm_01 {
    public static void main(String[] args) {
        JFrame f = new JFrame("帐号密码登入页面");
        f.setBounds(100,100,400,300);

        JButton jb = new JButton("登入");
        jb.setBounds(150,180,100,50);
        f.add(jb);


        f.setVisible(true);

    }
}
