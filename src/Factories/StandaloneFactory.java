package Factories;

/**
 * Created by Jack on 06.10.2014.
 */
public class StandaloneFactory {
    public static void main(String[] args) {
        CFactory cf = new CFactory();
        K k = cf.createK();
        k.method();
    }
}

interface K {
    void method();
}
interface KFactory {
    K createK();
}

class C implements K {
    public void method(){
        System.out.println("method called");
    }
}
class CFactory implements KFactory {
    public K createK(){
        return new C();
    }
}
