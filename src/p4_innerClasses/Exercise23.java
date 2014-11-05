package p4_innerClasses;

interface U {
    void meth1();
    void meth2();
    void meth3();
}
class A {
    U getURef(){
        return new U(){
            public void meth1(){
                System.out.println("meth1");
            }
            public void meth2(){
                System.out.println("meth2");
            }
            public void meth3(){
                System.out.println("meth3");
            }
        };
    }
}
class B {
    U[] items = new U[5];
    int ind = 0;
    boolean setItem(U item){
        if(ind<items.length) {
            items[ind++] = item;
            return true;
        } else {
            return false;
        }
    }
    boolean setNull(int argument){
        if(argument<items.length && argument>0){
            items[argument] = null;
            return true;
        } else {
            return false;
        }
    }
    void iterateItems(){
        for(U item: items){
            item.meth1();
            item.meth2();
            item.meth3();
        }
    }
}
public class Exercise23 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        B b = new B();
        for(int i = 0; i < 4; i++){
            b.setItem(a1.getURef());
        }
        b.setItem(a2.getURef());
        b.iterateItems();
        b.setNull(3);
        b.iterateItems();
    }
}
