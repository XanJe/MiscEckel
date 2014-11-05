package p2_polymorphism;

/**
 * Created by Jack on 27.08.2014.
 */
public class BlankFinal {
    public static void main(String[] args) {
        A1 a = new A1(3);
//        a.t = 3; // final
    }
}

class A1{
    final int t;
    A1(int t){
        this.t = t;
    }
    private void doSmth(){
        System.out.println("do!");
    }
}

class Ap extends A1{
    Ap(int t){
        super(t);
    }
    void doSmth(){ // THIS IS NOT OVERRIDE, THIS IS
        System.out.println("make a-do smth");
    }
}
