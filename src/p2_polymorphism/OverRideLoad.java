package p2_polymorphism;

/**
 * Created by Jack on 9/11/14.
 */
public class OverRideLoad {
    public static void main(String[] args) {
        Homer h = new Homer();
        h.drink();
//        Bart b = new Bart();
//        int i = b.drink();
    }
}

class Homer{
    long drink(){
        System.out.println("Homer is drinking");
        return 0L;
    }
}
//class Bart extends Homer{
//    int drink(){
//        System.out.println("Bart is drinking");
//        return 0;
//    }
//}
