package p1_beginning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by Jack on 31.07.2014.
 */
public class CoinFlopping {
    public static void main(String[] args) throws IOException {
        Random r = new Random();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(!br.readLine().equals("q"))
            if(r.nextBoolean()==true)
                System.out.println("Heads");
            else
                System.out.println("Tails");
    }
}
