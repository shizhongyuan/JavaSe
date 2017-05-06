package Abnormal;

/**
 * Created by Administrator on 2017/4/14 0014.
 */
public class Yc03 {
    public static void main(String[] args) {
        try {
            Yc03 n = new Yc03("意外");
        } catch (Abnormal.xaiy xaiy) {
            xaiy.printStackTrace();
        } catch (Abnormal.laos laos) {
            laos.printStackTrace();
        } catch (Abnormal.yiw yiw) {
            yiw.printStackTrace();
        }
    }

    private String name;

    public Yc03(String name) throws xaiy, laos, yiw {
        if (name == "下雨") {
            throw new xaiy("去上课");
        }
        else if (name=="老师不来"){
            throw new laos("在宿舍做练习");
        }
        else if (name=="意外"){
            throw new yiw("自己解决");
        }
        this.name = name;
        System.out.println(name);
    }
}

class xaiy extends Exception{
    public xaiy(String x){
        System.out.println("带雨伞");
        System.out.println(x);
    }
}

class laos extends Exception{
    public laos(String xx){
        System.out.println("不用去上课啦");
        System.out.println(xx);
    }
}

class yiw extends Exception{
    public yiw(String oo){
        System.out.println("不上啦");
        System.out.println(oo);
    }
}