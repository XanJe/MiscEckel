package p1_beginning;

/**
 * Created by Jack on 01.08.2014.
 */
public class Constructor {
    public static void main(String[] args) {

        StringHolder sh = new StringHolder();
        System.out.println("sh.s = " + sh.s);
        
        StringHolder2 sh2 = new StringHolder2();
        System.out.println("sh2.s = " + sh2.s);
    }
}
class StringHolder{
    String s;
    StringHolder(){
        this.s = "1";
    }
}
class StringHolder2{
    String s = "0";
}