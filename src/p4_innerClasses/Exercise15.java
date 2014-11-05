package p4_innerClasses;

/**
 * Created by Jack on 05.10.2014.
 */
public class Exercise15 {
    public static void main(String[] args) {
        Shelf s = new Shelf();
        Box b = s.getBox();
    }
}
class Box {
    Box(int i){
        value = i;
    }
    int value;
}
class Shelf {
    Box getBox(){
        return new Box(3){
            int c = value;
        };
    }
}
