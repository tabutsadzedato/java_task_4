package demo1;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("Dato");
        set.add("Gio");
        set.add("Misho");
        set.add("Rezi");
        set.add("Dato");
        set.add("Gio");
        set.add("Zuka");
        for(String name : set){
            System.out.println(name);
        }
    }

}