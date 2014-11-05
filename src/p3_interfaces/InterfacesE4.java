package p3_interfaces;

public class InterfacesE4 {
    public static void main(String[] args) {

        AcDer acd = new AcDer();
        acd.method();
    }
}

abstract class AC{
}

class AcDer extends AC{
    void method(){
        System.out.println("AcDer method");
    }
    static void sMeth(AC baseAc){
        AcDer t =  (AcDer)baseAc;
        t.method();
    }
}