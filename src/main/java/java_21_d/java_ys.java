package java_21_d;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class java_ys {
    public static void main(String[] args) {
        JFrame jf = new JFrame("窗口");
        jf.setBounds(100,100,800,600);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jf.setLayout(null);
        JLabel jl = new JLabel("请开局");
        jl.setBounds(100,400,300,25);
        jf.add(jl);

        JButton jb = new JButton("开局");
        jb.setBounds(100,450,100,25);
        jf.add(jb);

        jb.addActionListener(new jb_click());
    }
}
class jb_click implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        System.out.println("byedye");
        System.exit(0);

    }
}