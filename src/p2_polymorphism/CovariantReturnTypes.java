package p2_polymorphism;

/**
 * Created by Jack on 11.09.2014.
 */
public class CovariantReturnTypes {
    public static void main(String[] args) {
        Mill m = new Mill();
        Grain g = m.process();
        System.out.println(g);
        m = new WheatMill();
        g = m.process();
        System.out.println(g);

    }
}

class Grain{
    public String toString(){
        return "Grain";
    }
}
class Wheat extends Grain{
    public String toString() {
        return "Wheat";
    }
}
class Mill{
    Grain process(){
        return new Grain();
    }
}
class WheatMill extends Mill{
    Wheat process(){
        return new Wheat();
    }
}


