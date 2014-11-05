package p4_innerClasses;

/**
 * Created by Jack on 05.10.2014.
 */
public class Interconnection {
    private int outerVal = 1;
    class Inner2{
        private int innerVal = 2;
        void accessOuterVal(){
            outerVal++;
            System.out.println("outer val is " + outerVal);
        }
    }
    void accessInnerVal(){
        Inner2 i2 = new Inner2();
        i2.innerVal++;
        System.out.println("inner val is " + i2.innerVal);
    }
    public static void main(String[] args) {
        Interconnection outer = new Interconnection();
        outer.accessInnerVal();

        Interconnection.Inner2 inner = outer.new Inner2();
        inner.accessOuterVal();

        AnotherClass.doAnotherClass();
    }
}
class AnotherClass{
    static void doAnotherClass(){
        Interconnection k = new Interconnection();
        Interconnection.Inner2 n = k.new Inner2();
        n.accessOuterVal();
    }
}
