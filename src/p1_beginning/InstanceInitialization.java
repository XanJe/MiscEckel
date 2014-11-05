package p1_beginning;

/**
 * Created by Jack on 06.08.2014.
 */
public class InstanceInitialization {
    public static void main(String[] args) {
        Mugs m = new Mugs();
    }
}

class Mug {
    Mug(int marker){
        System.out.println("MUG #" + marker);
    }
}

class Mugs {
    Mug mug1;
    Mug mug2;
    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("mug1 and 2 initialized");
    }
    Mugs(){
        System.out.println("mugs");
    }
}