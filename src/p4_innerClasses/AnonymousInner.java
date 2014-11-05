package p4_innerClasses;

/**
 * Created by Jack on 05.10.2014.
 */
interface In {
    void make();
}
public class AnonymousInner {
    In method(){
        return new In(){ // begin anonymous class definition
            int c = 0;
            public void make(){
                System.out.println("this is... hm...");
            }
        }; // end anonymous class definition
    }

    public static void main(String[] args) {
        AnonymousInner outer = new AnonymousInner();
        In in =  outer.method();
        in.make();
    }
}
