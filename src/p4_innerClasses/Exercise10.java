package p4_innerClasses;

/**
 * Created by Jack on 05.10.2014.
 */
public class Exercise10 {
}
interface Interface2 {
    void interfaceMethod();
}
class Class2 {
    Interface2 method(){
        boolean b = true;
        if(b){
            class Inner implements Interface2 {
                public void interfaceMethod(){
                    System.out.println("I1 operation is done");
                }
            }
            return new Inner();

        } else
            return null;
    }
}