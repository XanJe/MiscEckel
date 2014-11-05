package p1_beginning;

import java.util.Random;

/**
 * Created by Jack on 01.08.2014.
 */
public class ForIJ {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 1, j = 1; i<=25; i++,j = j+2)
            System.out.println(r.nextInt()+" "+j);
    }
}
