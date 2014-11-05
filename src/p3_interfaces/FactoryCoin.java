package p3_interfaces;

import java.util.Random;

/**
 * Created by Jack on 04.10.2014.
 */
public class FactoryCoin {
    public static void main(String[] args) {
        Coin c = new Coin();
        c.toss();
        Dice d = new Dice();
        d.toss();

        TossableFactory tf = new DiceFactory();
        TossableFactory tf2 = new CoinFactory();
        Tossable ts1 = tf.createTossable();
        Tossable ts2 = tf2.createTossable();
        ts1.toss();
        ts2.toss();
    }
}

interface Tossable{
    void toss();
}
interface TossableFactory{
        Tossable createTossable();
        }
class DiceFactory implements TossableFactory{
    public Tossable createTossable(){
        return new Dice();
    }
}
class CoinFactory implements TossableFactory{
    public Tossable createTossable(){
        return new Coin();
    }
}
class Dice implements Tossable{
    public void toss(){
        System.out.print("toss dice: ");
        Random rn = new Random();
        int n = 6-1+1;
        int i = rn.nextInt() % n;
        int r = java.lang.Math.abs(i)+1;
        System.out.println(r);
    }
}
class Coin implements Tossable{
    public void toss(){
        System.out.print("toss coin: ");
        Random rn = new Random();
        int n = 2-1+1;
        int i = rn.nextInt() % n;
        int r = java.lang.Math.abs(i)+1;
        System.out.println(r);
    }
}
