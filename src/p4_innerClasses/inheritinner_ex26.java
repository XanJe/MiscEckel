package p4_innerClasses;

/**
 * Created by Jack on 07.10.2014.
 */
public class InheritInner_Ex26 extends Outer4.Inner4 {
    InheritInner_Ex26(int i, Outer4 o){
        o.super(i);
    }

    public static void main(String[] args) {
        Outer4 o4 = new Outer4();
        InheritInner_Ex26 ii = new InheritInner_Ex26(3,o4);
    }

}
class Outer4 {
    class Inner4 {
        int v;
        Inner4(int i){
            v = i;
        }
    }
}

