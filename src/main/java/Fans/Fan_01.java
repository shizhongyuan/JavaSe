package Fans;

/**
 * Created by Administrator on 2017/9/12 0012.
 */
public class Fan_01 {
    private int sen;
    private String name;
    public Fan_01(int sen,String name){
        super();
        this.sen=sen;
        this.name=name;
        System.out.println("Fan--"+this.sen+":"+this.name);
    }
    public Fan_01(){
        super();
        System.out.println("Fan_01--");
    }
    public void shuo(){
        System.out.println(sen+"----"+name);
    }
    public void shuo01(){
        System.out.println("--shuo01--");
    }
    public void shuo02(int sen,String name){
        System.out.println("shuo02---"+sen+":"+name);
    }

    public static void shuo03() {
        System.out.println("shuo03----");
    }
}
