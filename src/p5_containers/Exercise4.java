package p5_containers;

import java.util.*;

/**
 * Created by Jack on 07.10.2014.
 */
public class Exercise4 {
    public static void main(String[] args) {
        NameGenerator ng = new NameGenerator();
        ArrayList<String> al = new ArrayList<String>();
        LinkedList<String> ll = new LinkedList<String>();
        HashSet<String> hs = new HashSet<String>();
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        TreeSet<String> ts = new TreeSet<String>();

        ng.fillCollection(al);
        ng.fillCollection(ll);
        ng.fillCollection(hs);
        ng.fillCollection(lhs);
        ng.fillCollection(ts);

        System.out.println(ll);
        System.out.println(al);
        System.out.println(hs);
        System.out.println(lhs);
        System.out.println(ts);
    }
}

class NameGenerator{
    String[] names = {"Rorshach","Mr. Manhattan", "Owl","Silk Spectre",
            "Comedian"};
    int current = 0;
    String next(){
        if(current<names.length)
            return names[current++];
        else {
            current = 1;
            return names[0];
        }
    }
    void fillCollection(Collection<String> c){
        for(int i =0; i<10; i++){
            c.add(next());

        }
    }
}
