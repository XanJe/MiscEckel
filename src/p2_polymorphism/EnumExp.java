package p2_polymorphism;

/**
 * Created by Jack on 07.08.2014.
 */

enum Spiciness {
    NOT,
    MILD,
    MEDIUM,
    HOT,
    FLAMING
}

public class EnumExp {
    public static void main(String[] args) {
        Spiciness howHot = Spiciness.MEDIUM;
        for(Spiciness s : Spiciness.values())
            System.out.println("s = " + s + ", ordinal:" + s.ordinal());
    }
}
