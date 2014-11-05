package p5_containers;

import java.util.ArrayList;

/**
 * Created by Jack on 07.10.2014.
 */
public class Exercise1 {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
        for(int i=0; i<10; i++)
            gerbils.add(new Gerbil());
        for(Gerbil g : gerbils)
            g.hop();
    }


}
class Gerbil {
    final int gerbilNumber;
    static int counter = 1;
    Gerbil(){
        gerbilNumber = counter++;
    }
    void hop() {
        System.out.println("Gerbil #" + gerbilNumber + " hops!");
    }
}