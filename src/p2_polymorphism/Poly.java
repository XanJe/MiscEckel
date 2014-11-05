package p2_polymorphism;

/**
 * Created by Jack on 27.08.2014.
 */
public class Poly {
    public static void main(String[] args) {
        System.out.println("poly");
        B1 b1 = new B1();
        B1 bder = new Bder();

        System.out.println(bder.getAll());

    }
}

class B1 {
    String getName(){
        return "B's name";
    }
    String getAll(){
        return getName() + " and all";
    }
}

class Bder extends B1 {
    String getName(){
        return "Bder's name";
    }
}