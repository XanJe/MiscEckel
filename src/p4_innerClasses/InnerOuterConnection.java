package p4_innerClasses;

/**
 * Created by Jack on 04.10.2014.
 */



public class InnerOuterConnection {
    public static void main(String[] args) {
        Outer2 o = new Outer2();
        System.out.println(o.getV());
        o.method2();


    }
}

class Outer2{
    private int v;
    private void method(){
        System.out.println("outer class method");
        System.out.println("v is " + getV());
    }
    int getV() {return this.v;}
    class Inner{
        void modifyOuter(){
            v = 3;
            method();
        }
    }
    void method2(){
        Inner inn = new Inner();
        inn.modifyOuter();
    }
}
