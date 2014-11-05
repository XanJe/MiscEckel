package p1_beginning;

/**
 * Created by Jack on 05.08.2014.
 */
public class Finalize {
    public static void main(String[] args) {

        for (int i = 1; i<10; i++){
            new Tank(i); // anonymous
        }
        System.gc();
    }
}

class Tank {
    int l;
    public Tank(int a){
        l=a;
    }

    @Override
    protected void finalize() throws Throwable {
        if (l==0)
            super.finalize();
        else
            System.out.println("Can not finalize not empty tank:" + this);
    }

    @Override
    public String toString() {
        return ("Tank with level: "+l);
    }
}
