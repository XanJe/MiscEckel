package p1_beginning;

/**
 * Created by Jack on 19.08.2014.
 */
public class FuzzBuzz {
    public static void main(String[] args) {
        for(int i = 1; i<=100; i++){
            if(i%3 == 0 && i%5 !=0)
                System.out.println("Fizz");
            if(i%3 == 0 && i%5 ==0)
                System.out.println("FizzBuzz");
            if(i%3 != 0 && i%5 !=0)
                System.out.println(i);
            if(i%3 != 0 && i%5 ==0)
                System.out.println("Buzz");
        }
        System.out.println("+++++++++++++++++++++++++++");
        for(int i = 1; i<=100; i++){
            if(i%3==0)
                System.out.print("Fizz");
            if(i%5==0)
                System.out.print("Buzz");
            if(i%3!=0 && i%5!=0)
                System.out.print(i);
            System.out.println();
        }



    }
}
