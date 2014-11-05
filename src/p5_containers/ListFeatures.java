package p5_containers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jack on 07.10.2014.
 */
public class ListFeatures {
    public static void main(String[] args) {
        List<Pet> pets = new ArrayList<Pet>();
        pets.add(new Pet("Mouse"));
        pets.add(new Pet("Dog"));
        pets.add(new Pet("Cat"));
        pets.add(new Pet("Hamster"));
        Pet p1 = new Pet("Rat");
        pets.add(p1);

        System.out.println(pets);
        List<Pet> pl = pets.subList(2,4);
        System.out.println(pl);
    }

}
class Pet{
    String creature;
    Pet(String s){
        creature = s;
    }

    @Override
    public String toString() {
        return creature;
    }
}

