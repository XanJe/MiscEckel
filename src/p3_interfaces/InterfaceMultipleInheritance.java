package p3_interfaces;

/**
 * Created by Jack on 04.10.2014.
 */
public class InterfaceMultipleInheritance {
    public static void main(String[] args) {
        Cl c = new Cl();
    }
}

class Cl implements D{
    public void foo(){
        System.out.println("foo");
    }
    public void bar(){
        System.out.println("bar");
    }
    public void methA() {
        System.out.println("method A");}
    public void methC(){
        System.out.println("method B");
    }
}

interface A {
    void foo();
}
interface B extends A {
    void foo();
    void methA();
}
interface C extends A {
    void foo();
    void methC();
}
interface D extends B,C {
    void bar();
}
