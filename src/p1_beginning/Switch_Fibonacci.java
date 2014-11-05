package p1_beginning;

/**
 * Created by Jack on 01.08.2014.
 */
public class Switch_Fibonacci {
    public static void main(String[] args) {

        int k = 1;
        switch(k){
            case 1 :
                System.out.println("one");
            case 2:
                System.out.println("two");
            case 3 :
                System.out.println("three"); break;
            default :
                System.out.println("something else");
        }



        int h = 25;
        int r = 0;
        int rm1=1;
        int rm2=1;
        System.out.println(rm1);
        System.out.println(rm2);
        while(true){
            r = rm1+rm2;
            if(r>h) break;
            rm2 = rm1;
            rm1 = r;
            System.out.println(r);
        }



    }
}
