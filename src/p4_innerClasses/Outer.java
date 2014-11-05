package p4_innerClasses;

/**
 * Created by Jack on 04.10.2014.
 */
public class Outer {
    class Inner{
        int i;
        @Override
        public String toString() {
            return Integer.toString(i);
        }
    }
    Inner getInner(){
        return new Inner();
    }

    public static void main(String[] args) {
        Inner inn;
        Outer out = new Outer();
        inn = out.getInner();
        System.out.println(inn);

    }
}
