package p4_innerClasses;

/**
 * Created by Jack on 05.10.2014.
 */
interface I2 {
    void i2Meth();
}

public class Exercise11 {
    private class Inner implements I2 {
        public void i2Meth() {
            System.out.println("requested method");
        }
        I2 getInstance(){
            return new Inner();
        }
    }

    public static void main(String[] args) {
        Exercise11 e = new Exercise11();
        Exercise11.Inner i = e.new Inner();
    }
}
