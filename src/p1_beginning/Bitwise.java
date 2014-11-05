package p1_beginning;

/**
 * Created by Jack on 31.07.2014.
 */
public class Bitwise {
    public static void main(String[] args) {
        int a = 0x00EF;
        int b = 0x001A;
        System.out.println("Integer.toBinaryString(a) = " + Integer.toBinaryString(a));
        System.out.println("Integer.toBinaryString(b) = " + Integer.toBinaryString(b));

        int and = a & b;
        System.out.println("and = " + Integer.toBinaryString(and));
        int or = a | b;
        System.out.println("or = " + Integer.toBinaryString(or));
        int xor = a ^ b;
        System.out.println("xor = " + Integer.toBinaryString(xor));
        int not = ~a;
        System.out.println("not a = " + Integer.toBinaryString(not));
        int lshift = a << 1;
        System.out.println("signed lshift = " + Integer.toBinaryString(lshift));
        int rshift = a >> 1;
        System.out.println("signed rshift = " + Integer.toBinaryString(rshift));
        int urshift = a >>> 1;
        System.out.println("unsigned rshift = " + Integer.toBinaryString(urshift));

        int c = 0x80000000;
        for(int shift = 0; shift <32; shift++)
            System.out.println("c>>shift = " + Integer.toBinaryString(c>>shift));

        int d = 0xFFFFFFFF;
        System.out.println("d = " + Integer.toBinaryString(d));
        d = d << 1;
        System.out.println("d = " + Integer.toBinaryString(d));
        for(int shift = 0; shift <32; shift++)
            System.out.println("d>>>shift = " + Integer.toBinaryString(d>>>shift));

        char c1 = 'n';
        System.out.println("charToBin(c1) = " + charToBin(c1));
    }
    static String charToBin(char ch){
        return Integer.toBinaryString(ch);
    }
}
