package p2_polymorphism;

/**
 * Created by Jack on 11.09.2014.
 */
public class DownCast {
    public static void main(String[] args) {
        Useful[] x = {
                new Useful(),
                new MoreUseful()
        };
        x[0].f();
        x[1].f();

        ((MoreUseful)x[1]).u();
    }
}

 class Useful{
     public void f(){};
     public void g(){};
 }
class MoreUseful extends Useful{
    public void f(){};
    public void g(){};
    public void u(){
        System.out.println("UUU");}
}