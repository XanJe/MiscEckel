package Factories;

public class NamelessFactory {
    public static void main(String[] args) {
        I var = A.factory.createI();
        var.method();
    }
}
interface J {
    void method();
}
interface JFactory {
    J createJ();
}
class B implements J {
    J getJ(){
            return new JFactory(){ // nameless factory
                public J createJ(){
                    return new B();
                }
            }.createJ();
    }
    public void method(){
        System.out.println("method 1");
    }
}