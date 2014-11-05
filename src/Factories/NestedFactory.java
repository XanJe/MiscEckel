package Factories;

public class NestedFactory {

    public static void main(String[] args) {
        I var = A.factory.createI();
        var.method();
    }
}
interface I{
    void method();
}
interface Factory {
    I createI();
}


class A implements I{
    I getI(){
        return factory.createI();
    }
    static Factory factory = new Factory(){ // nested factory
        public I createI(){
            return new A();
        }
    };
    public void method(){
        System.out.println("method 1");
<<<<<<< HEAD
=======

>>>>>>> b3caefea7c8671301586c96c9528b7568911dfa5
    }
}