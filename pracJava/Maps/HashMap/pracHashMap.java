package Maps.HashMap;


import java.util.*;

public class pracHashMap {
    public static void main(String[] args) {
        HashMap hm1=new HashMap();
        hm1.put(1, "Arnab");
        hm1.put(2, "Srikanta");
        hm1.put(3, "Thala");
        System.out.println(hm1);
//Does not mentain order
        HashMap hm2=new HashMap();
        hm2.put("Arnab", "Srikanta's Wife");
        hm2.put("Srikanta", "Thala");
        hm2.put("Sayak","Everybody");
        System.out.println(hm2);
//Linked HashSet
        LinkedHashMap lhm=new LinkedHashMap();
        lhm.put("Arnab", "Srikanta's Wife");
        lhm.put("Srikanta", "Thala");
        lhm.put("Sayak","Everybody");
        System.out.println(lhm);
    }
}
