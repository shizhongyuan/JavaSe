package java_21_d;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Card extends JLabel {
    private String huase; // 花色
    private int shuzi; // 数字
    private int dianshu; // 点数

    public String getHuase() {
        return huase;
    }

    public void setHuase(String huase) {
        this.huase = huase;
    }

    public int getShuzi() {
        return shuzi;
    }

    public void setShuzi(int shuzi) {
        this.shuzi = shuzi;

        this.dianshu = shuzi;
        if (this.dianshu > 10) {
            this.dianshu = 10;
        }
    }

    public int getDianshu() {
        return dianshu;
    }

    public void setDianshu(int dianshu) {
        this.dianshu = dianshu;
    }

    public void loadImg(boolean isZhengMian) {
        String s;
        if (isZhengMian == true) {
            s = "img/" + huase + shuzi + ".bmp";
        } else {
            s = "img/背景02.bmp";
        }
        File f = new File(s);
        try {
            BufferedImage bi = ImageIO.read(f);
            ImageIcon icon = new ImageIcon(bi);
            this.setIcon(icon);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
