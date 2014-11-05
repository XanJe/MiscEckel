package p2_polymorphism;

/**
 * Created by Jack on 07.08.2014.
 */
public class SundaeExp {
    public static void main(String[] args) {
        Sundae x = Sundae.makeASundae();
    }
}

class Sundae{
    private Sundae(){
        System.out.println("private constructor"); //inheritance impossible!
    }
    static Sundae makeASundae(){
        return new Sundae();
    }
}
