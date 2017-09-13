package ZhangMi;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Administrator on 2017/8/7 0007.
 */
public class Mm01 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("帐号密码登入页面");
        jf.setBounds(100,100,400,300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jf.setLayout(null);
        JLabel jl = new JLabel("帐号:");
        jl.setBounds(50,50,300,25);
        jf.add(jl);

        jf.setLayout(null);
        JLabel j2 = new JLabel("密码:");
        j2.setBounds(50,100,300,25);
        jf.add(j2);

        JTextField oo = new JTextField();     // 表1
        oo.setBounds(95,50,200,25);
        jf.add(oo);

        JTextField oo1 = new JTextField(20);     // 表2
        oo1.setBounds(95,100,200,25);
        jf.add(oo1);

        JButton jb = new JButton("登入");
        jb.setBounds(140,180,100,50);
        jf.add(jb);

        jb.addActionListener(new jb_click());
    }
}
class jb_click implements ActionListener {
    public void actionPerformed(ActionEvent e) {

    }
}

