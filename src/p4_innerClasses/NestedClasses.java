package p4_innerClasses;

/**
 * Created by Jack on 06.10.2014.
 */
public class NestedClasses {
    class Inner1 {
        class Inner2 {
            void ding(){
                System.out.println("Ding1");
            }
        }
    }

    public static void main(String[] args) {
        NestedClasses outer = new NestedClasses();
        NestedClasses.Inner1 inner1 = outer.new Inner1();
        Inner1.Inner2 inner2 = inner1.new Inner2();
        inner2.ding();

        Outer3.Inner1.Inner2 i2 = new Outer3.Inner1.Inner2();
        i2.ding();
    }
}
class Outer3 {
    static class Inner1 {
        static class Inner2 {
            void ding(){
                System.out.println("Ding2");
            }
        }
    }
}
