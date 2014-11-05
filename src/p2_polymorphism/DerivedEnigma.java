package p2_polymorphism;

/**
 * Created by Jack on 27.08.2014.
 */
public class DerivedEnigma {

    private void f(){
        System.out.println("private f()");
    }

    public static void main(String[] args) {
        DerivedEnigma d = new Derived();

        d.f(); // НЕПОНЯТНО ВООБЩЕ ECKEL IV 202
    }
}

class Derived extends DerivedEnigma{
    public void f(){
        System.out.println("public f()");
    }
}
