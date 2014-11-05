package p2_polymorphism;

/**
 * Created by Jack on 07.08.2014.
 */
public class ProtectedExp {
    public static void main(String[] args) {
        Cake c = new Cake();
        c.w = 3;
        System.out.println("c = " + c);

        Pie p = new Pie();
        p.w = 4;
        System.out.println("p = " + p);
    }
}

class Cake{
    protected float w;

    @Override
    public String toString() {
        return Float.toString(w);
    }
}

class Pie extends Cake{
    public void setW(float w){
        this.w = w;
    }
}


