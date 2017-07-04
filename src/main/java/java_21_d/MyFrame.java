package java_21_d;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;

public class MyFrame extends JFrame {


    MyFrame thisMyFrame = this;
    JLabel jl = new JLabel("请开局：");
    JLabel jl01 = new JLabel("游戏规则：谁接近21点谁赢" + "（注不可以超过21 点超过21点则爆(输)）");
    JButton jb = new JButton("开局");
    JButton jb01 = new JButton("要牌");
    JButton jb02 = new JButton("不要");

    ArrayList<Card> allCard = new ArrayList<Card>();
    ArrayList<Card> computerCardList = new ArrayList<Card>();
    ArrayList<Card> playerCardList = new ArrayList<Card>();

    public MyFrame() {
        this.setTitle("21点小游戏");
        this.setBounds(100, 100, 800, 600);
        this.setLayout(null);

        jl.setBounds(100, 400, 300, 25);
        this.add(jl);

        jl01.setBounds(40, 20, 400, 25);
        this.add(jl01);

        jb.setBounds(100, 450, 100, 25);
        jb.addActionListener(new x_click());
        this.add(jb);

        jb01.setBounds(250, 450, 100, 25);
        jb01.setEnabled(false);
        jb01.addActionListener(new x1_click());
        // jb01.addActionListener(new x_click());
        this.add(jb01);

        jb02.setBounds(400, 450, 100, 25);
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
        Random rand1 = new Random();

        int index1=rand1.nextInt(allCard.size());
        Card c=allCard.get(index1);

        playerCardList.add(c);
        allCard.remove(index1);
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

    public int sumDianShu(ArrayList<Card> list){		// 记录点数
        int sum=0;
        for(int x=0;x<list.size();x++){
            Card c=list.get(x);
            int y=c.getDianshu();
            sum=y+sum;
        }
        return sum;
    }


    private class x_click implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for(int i=0;i<playerCardList.size();i++){
                Card c = playerCardList.get(i);
                thisMyFrame.remove(c);
            }
            for(int i=0;i<computerCardList.size();i++){
                Card c = computerCardList.get(i);
                thisMyFrame.remove(c);
            }
            allCard.clear();
            computerCardList.clear();
            playerCardList.clear();
            jl.setText("游戏开始");
            jb01.setEnabled(true);
            jb02.setEnabled(true);
            createAllCard();        //生成一副牌调用
            sendCard2Computer();    //发一张牌给电脑调用
            sendCard2player();      //发一张牌给玩家调用
            showCards(computerCardList,80,false);
            showCards(playerCardList,250,true);
            jb.setEnabled(false);
        }
    }

    private class x1_click implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            sendCard2player();      //发一张牌给玩家调用
            int sum = sumDianShu(computerCardList);

            if(sum<16){
                sendCard2Computer();	//发一张牌给电脑调用
            }else{}
            showCards(computerCardList,80,false);
            showCards(playerCardList,250,true);

        }
    }
    private class x2_click implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int sum = sumDianShu(computerCardList);
            while (sum < 16) {
                sendCard2Computer(); // 发一张牌给电脑调用
                sum = sumDianShu(computerCardList);
            }
            showCards(computerCardList, 80, true);

            int sum1 = sumDianShu(computerCardList); // 电脑
            int sum2 = sumDianShu(playerCardList); // 玩家

            if (sum1 > 21 && sum2 > 21) {
                jl.setText("爆啦  再来");

            }
            else if (sum1 == sum2  ) {
                jl.setText("平啦");
            }

            else if (sum1 >= 21 && sum2 <= 21) {
                jl.setText("你赢啦");
            } else if (sum1 <= 21 && sum2 >= 21) {
                jl.setText("电脑赢啦");
            }
            if (sum1 < 21 && sum2 < 21) {
                if (sum1 > sum2) {
                    jl.setText("电脑赢啦");
                } else if (sum1 < sum2) {
                    jl.setText("你赢啦");
                }
            }
            jb.setEnabled(true);
        }
    }
}