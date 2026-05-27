
import java.util.*;
public class accessObj {
    public static void main(String[] args){
        HashMap hm1=new HashMap();
        hm1.put(1,"Arnab");
        hm1.put(2,"Srikanta");
        hm1.put(3,"Thala");
        hm1.put(4,"Credit Stealer");
        hm1.put(5,"Helicopter Shot");
        hm1.put(6,"Backshot");
        System.out.println(hm1);

        //accessing values and keys
        System.out.println(hm1.get(3));
             System.out.println("------------------------");
        Set hm1Key=hm1.keySet();

        Iterator it1=hm1Key.iterator();
        while(it1.hasNext()){
            System.out.println(hm1.get(it1.next()));
        }
        System.out.println("------------------------");
        Collection hm1Val=hm1.values();
        Iterator it2=hm1Val.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
    Set hm1Entry=hm1.entrySet();
    Iterator it3=hm1Entry.iterator();
    while(it3.hasNext()){
        Map.Entry data=(Map.Entry)it3.next();
        // System.out.println(((Map.Entry)it3.next()).getKey()+" "+((Map.Entry)it3.next()).getValue());
        System.out.println(data.getKey()+"->"+data.getValue());
    }
    }

}
