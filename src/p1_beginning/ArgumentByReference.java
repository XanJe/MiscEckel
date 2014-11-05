package p1_beginning;

public class ArgumentByReference {
    static Integer k;
    public static void main(String[] args) {
        Box b = new Box();
        System.out.println(b);
        methodIntroducingChanges(b);
        System.out.println(b);

        Integer i = new Integer(0);
        System.out.println(i);
        someMethod(i);
        System.out.println(i);

        String s = "Hello!";
        changeString(s);
        System.out.println("s = " + s);
    }
    static void someMethod(Integer i){
        System.out.println("i.getClass() = " + i.getClass());
        i = new Integer(5);
    }

    static void methodIntroducingChanges(Box a){
        a.h = 1;
        a.w = 1;
        a.l = 1;
    }

    static void changeString(String s){
        s = new String("sdfs");
    }
}

class Box{
        int h;
        int w;
        int l;
    @Override
    public String toString(){
        return "Box: h="+h+", w="+w+", l="+l;
    }
}