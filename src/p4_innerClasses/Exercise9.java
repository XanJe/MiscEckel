package p4_innerClasses;

/**
 * Created by Jack on 05.10.2014.
 */
/* Exercise 9: rather tricky*/
interface Interface1 {
    void interfaceMethod();
}
class C1 {
    Interface1 method(){
        class Inner implements Interface1 {
            public void interfaceMethod(){
                System.out.println("I1 operation is done");
            }
        }
        return new Inner();
    }

    public static void main(String[] args) {
        C1 c = new C1();
        c.method().interfaceMethod();
    }
}
