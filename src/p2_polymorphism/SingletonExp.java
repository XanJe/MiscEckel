package p2_polymorphism;

/**
 * Created by Jack on 07.08.2014.
 */
public class SingletonExp {
    public static void main(String[] args) {
        Singleton s = Singleton.access();
        s.f = 3;
        // singleton s = new Singleton();
    }
}

class Singleton{
    private Singleton(){}; //constructor, prohibiting creation of other objects
    private static Singleton sng = new Singleton(); //static field initialized
    public int f = 0;
    public static Singleton access(){ //access singleton
        return sng;
    }
    public void show(){
        System.out.println("this is a singleton");
    }
}