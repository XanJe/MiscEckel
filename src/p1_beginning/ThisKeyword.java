package p1_beginning;

/**
 * Created by Jack on 01.08.2014.
 */
public class ThisKeyword {
    public static void main(String[] args) {
        T a = new T();
        a.callTwice();
    }


}

class T{
    int f = 0;
    void incField(){
        f++;
    }
    void callTwice(){
        incField();
        System.out.println("f = " + f);
        this.incField();
        System.out.println("f = " + f);
    }
}
