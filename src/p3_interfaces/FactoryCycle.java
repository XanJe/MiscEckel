package p3_interfaces;

/**
 * Created by Jack on 04.10.2014.
 */
public class FactoryCycle {
}

interface Cycle{ void ride(); }
interface CycleFactory{ Cycle getCycle(); }

class Unicycle implements Cycle {
    public void ride(){
        System.out.println("Ride Unicycle");
    }
}
class Bicycle implements Cycle {
    public void ride(){
        System.out.println("Ride Bicycle");
    }
}
class Tricycle implements Cycle {
    public void ride(){
        System.out.println("Ride tricycle");
    }
}
class UnicycleFactory implements CycleFactory {
    public Cycle getCycle(){
        return new Unicycle();
    }
}
class BicycleFactory implements CycleFactory {
    public Cycle getCycle() { return new Bicycle(); }
}
