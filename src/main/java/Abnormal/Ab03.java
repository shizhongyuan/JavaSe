package Abnormal;

/**
 * Created by Administrator on 2017/4/10 0010.
 */
class Pyc{
    private int qq;
    public Pyc(int qq) throws yclei {
        if (qq!=1067164628){
            throw new yclei("你输入的QQ账号错啦");
        }
        this.qq=qq;
        System.out.println("你的QQ账号为对啦");
    }

    public static void main(String[] args){
        try {
            Pyc pyc = new Pyc(106764628);
        }
         catch (Abnormal.yclei yclei) {
            yclei.printStackTrace();
        }
    }
}

class yclei extends Exception{
  public yclei(String qq){
      System.out.println(qq);
      System.out.println("请再输入");
  }
}

