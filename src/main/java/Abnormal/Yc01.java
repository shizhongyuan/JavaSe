package Abnormal;

public class Yc01 {
    public static void main(String[] args){
        try {
            Yc01 yc01 = new Yc01("扭伤");
        } catch (Abnormal.q q) {
            q.printStackTrace();
        } catch (Abnormal.qq qq) {
            qq.printStackTrace();
        }
        finally {
            System.out.println("打针 吃药");
        }
    }
    private String da;
    Yc01(String da) throws q, qq {
        if (da=="扭伤"){
            throw new q("打不了球了 扭伤啦");
        }
        else if (da=="严重受伤"){
           throw new qq("不打啦");
        }
        this.da = da;
        System.out.println("正常去打球");
    }
}

class q extends Exception{
    public q(String da){
        System.out.println(da);
        System.out.println("好好养伤吧");
    }
}

class qq extends Exception{
    public qq(String qq){
        System.out.println(qq);
        System.out.println("肯定打不了啦 必须直接上医院");
    }
}