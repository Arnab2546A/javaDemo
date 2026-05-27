
import java.util.*;
public class hashSet {
    public static void main(String[] agrs){
        HashSet hs=new HashSet();
        hs.add(100);
        hs.add(20);
        hs.add(35);
        hs.add(10);
        hs.add(101);
        System.out.println(hs);

        LinkedHashSet hs1=new LinkedHashSet();
        hs1.add(100);
        hs1.add(20);
        hs1.add(35);
        hs1.add(10);
        hs1.add(101);
        System.out.println(hs1);
    }
}
