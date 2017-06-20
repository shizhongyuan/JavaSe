package java_21_d;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;
public class MyFrame extends JFrame{

        MyFrame thisMyFrame = this;
        JLabel jl = new JLabel("请开局：");
        JLabel jl01 = new JLabel("游戏规则：谁接近21点谁赢" +
                "（注不可以超过21点超过21点则爆点如点数相同或都爆则打平）");
        JButton jb = new JButton("开局");
        JButton jb01 = new JButton("要牌");
        JButton jb02 = new JButton("不要");

        ArrayList<Card> allCard = new ArrayList<Card>();
        ArrayList<Card> computerCardList = new ArrayList<Card>();
        ArrayList<Card> playerCardList = new ArrayList<Card>();

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

    public void createAllCard() {           //生成一副牌
        String[] s = { "方", "梅", "红", "黑" };
        for (int ys = 0; ys < 4; ys++)
            for (int shuzi = 1; shuzi <= 13; shuzi++) {
                Card c = new Card();
                c.setShuzi(shuzi);
                c.setHuase(s[ys]);
                allCard.add(c);
            }
    }

     public void sendCard2Computer() {      //发一张牌给电脑
                Random rand = new Random();

                int index=rand.nextInt(allCard.size());
                Card c=allCard.get(index);

                computerCardList.add(c);
                allCard.remove(index);
            }

     public void sendCard2player(){     //发一张牌给玩家
                Random rand = new Random();

                int index=rand.nextInt(allCard.size());
                Card c=allCard.get(index);

                playerCardList.add(c);
                allCard.remove(index);
            }

    public void showCards(ArrayList<Card> list,int y,boolean showFirstCard){
        int x=100;
        for (int i = 0; i < list.size(); i++) {
            Card c=list.get(i);
            c.setSize(71,96);
            if (i==0 && !showFirstCard) {       // 电脑显示的第一张背面牌
            c.loadImg(false);
            }else {
            c.loadImg(true);
            }
            c.setLocation(x,y);
            x+=81;
            this.add(c);
        }
            this.repaint();
    }

    public void sumDianShu(ArrayList<Card> list,int y,boolean sumDianShu){
        int x=100;
        for (int i = 0; i < list.size(); i++) {
            Card c=list.get(i);
            c.setSize(71,96);
            if (i==0 && !sumDianShu) {
                c.loadImg(true);
            }else {
                c.loadImg(false);
            }
            c.setLocation(x,y);
            x+=81;
            this.add(c);
        }
        this.repaint();
    }

    private class x_click implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                jl.setText("游戏开始");
                jb01.setEnabled(true);
                jb02.setEnabled(true);
                createAllCard();        //生成一副牌调用
                sendCard2Computer();    //发一张牌给电脑调用
                sendCard2player();      //发一张牌给玩家调用
                showCards(allCard,80,false);
                sumDianShu(allCard,250,true);
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