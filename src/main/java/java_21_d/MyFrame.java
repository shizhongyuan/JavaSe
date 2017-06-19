package java_21_d;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class MyFrame extends JFrame{

        MyFrame thisMyFrame = this;
        JLabel jl = new JLabel("请开局：");
        JLabel jl01 = new JLabel("游戏规则：谁接近21点谁赢" +
                "（注不可以超过21点超过21点则爆点如点数相同或都爆则打平）");
        JButton jb = new JButton("开局");
        JButton jb01 = new JButton("要牌");
        JButton jb02 = new JButton("不要");

        public MyFrame(){
            this.setTitle("21点小游戏");
            this.setBounds(100,100,800,600);
            this.setLayout(null);

            jl.setBounds(100,400,300,25);
            this.add(jl);

            jl01.setBounds(80,10,600,25);
            this.add(jl01);

            jb.setBounds(100,450,100,25);
            jb.addActionListener(new x_click());
            this.add(jb);

            jb01.setBounds(250,450,100,25);
            jb01.setEnabled(false);
            jb01.addActionListener(new x1_click());
            this.add(jb01);

            jb02.setBounds(400,450,100,25);
            jb02.setEnabled(false);
            jb02.addActionListener(new x2_click());
            this.add(jb02);

            this.setVisible(true);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private class x_click implements ActionListener{
            public void actionPerformed(ActionEvent e) {
            }
        }
        private class x1_click implements ActionListener{
            public void actionPerformed(ActionEvent e) {
            }
        }

        private class x2_click implements ActionListener{
            public void actionPerformed(ActionEvent e) {
            }
    }
}