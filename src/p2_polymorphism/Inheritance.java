package p2_polymorphism;

/**
 * Created by Jack on 19.08.2014.
 */
public class Inheritance {
    public static void main(String[] args) {
        System.out.println("Inheritance");
        Cartoon c = new Cartoon();

        System.out.println();
        System.out.println("----------------");
        C1 obj = new C1();
    }
}

class Art{
    Art(){
        System.out.println("Art constructor");
    }
        }

class Drawing extends Art{
    Drawing(){
        System.out.println("Drawing constructor");
    }
}

class Cartoon extends Drawing{
    Cartoon(){
        System.out.println("Cartoon constructor");
    }
}

// new example
class A{
    int a;
    A(){
        System.out.println("A created");
    }
}
class B{
    int b;
    B(){
        System.out.println("B created");
    }
}
class C extends A{
    int c;
    B1 b = new B1();
}

// new example
class Game{
    Game(int i){
        System.out.println("i = " + i);
    }
}
class BoardGame extends Game{
    BoardGame(){
        super(3);
    }
    int j;
}