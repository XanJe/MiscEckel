package p1_beginning;

/**
 * Created by Jack on 06.08.2014.
 */
public class VarArgs {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(f(1,"new",arr));
        System.out.println(f(1,"new",3,4));
    }
    static int f(int a, String b, int... c){
        int r = a;
        for(int i:c)
            r +=i;
        return r;
    }
}
