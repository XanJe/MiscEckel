package p4_innerClasses;

/**
 * Created by Jack on 06.10.2014.
 */

interface Kickable{
    void kick();
}

public class Test {
    Kickable returnKickable(){
        Kickable k = new Kickable(){
            public void kick(){
                System.out.println("make a kick");
            }
        };
        return k;
    }

    public static void main(String[] args) {
        Test t = new Test();
        Kickable k = t.returnKickable();
        k.kick();
        Test2 t2 = new Test2();
        k = t2.retK();
        k.kick();
    }
}

class Test2 {
    Kickable retK(){
        return new Kickable(){
            public void kick(){
                System.out.println("test2 kickable kick");
            }
        };
    }
}
