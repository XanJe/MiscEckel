package p1_beginning;

/**
 * Created by Jack on 31.07.2014.
 */
public class Aliasing {
    public static void main(String[] args) {
        System.out.println("!");

        Letter c1 = new Letter();
        c1.c = 'L';

        passObject.f(c1);
        System.out.println("c1 = " + c1.c);
    }

}

class Letter{
    char c;

}
class passObject{
    static void f(Letter l){
        l.c = 'm';
    }
}