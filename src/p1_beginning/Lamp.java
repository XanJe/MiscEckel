package p1_beginning;

import java.util.HashMap;

public class Lamp {

    public static void main(String[] args) {
        HashMap<Integer,Foo> m = new HashMap<Integer,Foo>();
        m.put(1,new Foo(1,1));
        m.put(2,new Foo(2,2));
        m.put(3,new Foo(1,2));
        m.put(4,new Foo(1,1));
        System.out.println("m = " + m);

        TableLamp tl = new TableLamp();
        System.out.println("tl.color = " + tl.color);
        System.out.println("tl.someParam = " + tl.someParam);
        System.out.println("tl.flickering = " + tl.flickering);
        System.out.println("tl.id = " + tl.id);

        TableLamp tl2 = new TableLamp();
        System.out.println("tl2.id = " + tl2.id);
//        System.out.println("tl.lightness = " + tl.lightness);

    }
}

class Foo{
    private int a;
    private int b;
    Foo(int a, int b){
        this.a = a;
        this.b = b;
    }
    Foo(){
        this.a = 0;
        this.b = 0;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "["+String.valueOf(a) + "," + String.valueOf(b)+"]";
    }
}

class Light{
    /** lightness of a <em>light</em>, in candelas */
    private int lightness;
    protected int color;
    public int flickering;
    static int counter;
    final int id = ++counter;

    public void on(){
        System.out.println("the light is on");
    }
}

class TableLamp extends Light {
    public int someParam;
}

