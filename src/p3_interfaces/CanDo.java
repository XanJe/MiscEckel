package p3_interfaces;

/**
 * Created by Jack on 04.10.2014.
 */
public class CanDo {
}

interface CanFight{
    void fight();
}
interface CanSwim{
    void swim();
}
interface CanFly{
    void fly();
}

class ActionCharacter {
    public void fight() {}
}
class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly {
    public void fly() {}
    public void swim() {}
}
class Adventure {
    public static void t(CanFight x){
        x.fight();
    }
}