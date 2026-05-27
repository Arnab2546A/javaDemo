
import java.util.*;



public class hTableTmap{
    public static void main(String[]args){
        Hashtable ht=new Hashtable();
        ht.put(1,"Arnab");
        ht.put(2,"Thala");
        ht.put(3,"helicopter");
        ht.putIfAbsent(2, "Captain Fool");
        System.out.println(ht);

        TreeMap tm=new TreeMap();
        tm.put("Thala","Thala");
        tm.put("Arnab","Arnab");
        tm.put("shree-kanta","shree-kanta");
        tm.put("helicopter","helicopter");
        System.out.println("-----------------------");
        System.out.println(tm);
    }
    
}