package p1_beginning;

/**
 * Created by Jack on 06.08.2014.
 */
public class StringArray {
    public static void main(String[] args) {
        AuxClass[] a = {new AuxClass("1"),
                    new AuxClass("a"),
                    new AuxClass("+")};
    }
}

class AuxClass {
    AuxClass(String s){
        System.out.println(s);
    }
}
