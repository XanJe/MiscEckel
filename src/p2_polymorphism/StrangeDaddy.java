package p2_polymorphism;

/**
 * Created by Jack on 8/28/14.
 */
public class StrangeDaddy {
    public static void main(String[] args) {
        Daddy d = new Son();
        d.doA();
    }
}

class Daddy{
    public void doA(){
        System.out.println("daddy");}
}
class Son extends Daddy{
    public void doA(){
        System.out.println("son");
    }
}