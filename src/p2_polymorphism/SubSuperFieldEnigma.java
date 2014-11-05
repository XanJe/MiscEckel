package p2_polymorphism;

/**
 * Created by Jack on 27.08.2014.
 */
public class SubSuperFieldEnigma {
    public static void main(String[] args) {

        C1 c = new C1();
        Cder cder = new Cder();

        System.out.println(c);
        System.out.println(cder);
    }
}

class C1 {
    public int t = 1;

    @Override
    public String toString() {
        return "object C with value " + t;
    }
}
class Cder extends C1 {
    public int t = 2;

    @Override
    public String toString() {
        return "object C with value " + t + ", super value " + super.t;
    }
}
