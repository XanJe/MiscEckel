package p4_innerClasses;


interface I4 {
    void sayHi();
    class Inner {
        int i = 7;
        static void show(I4 input){
            input.sayHi();
        }
    }
}

class E implements I4 {
    public void sayHi() {
        System.out.println("Hi");
    }
    void imlpementation(){

    }
}


public class InterfaceWithNestedClass {
    public static void main(String[] args) {
        E e = new E();
        E.Inner.show(e);
    }
}
