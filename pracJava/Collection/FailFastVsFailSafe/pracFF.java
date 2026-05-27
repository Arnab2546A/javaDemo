
import java.util.*;
import java.util.concurrent.*;
public class pracFF {
    public static void main(String[] args) {
        ArrayList al1=new ArrayList();
        al1.add(100);
        al1.add(200);
        al1.add(300);
        al1.add(245);
        Iterator it=al1.iterator();
        //Fail Fast
        while(it.hasNext()){
            System.out.println(it.next());
           // al1.add(100);
        }
        CopyOnWriteArrayList al2=new CopyOnWriteArrayList();
        al2.add(100);
        al2.add(200);
        al2.add(300);
        al2.add(245);
        System.out.println(al2);
        Iterator it1=al2.iterator();
        //Fail Safe
        while(it1.hasNext()){
            System.out.println(it1.next());
            al2.add(400);
            //after adding the element on the list the iterator will work on the previous copy. So it will not throw exeption
        }
        //But originaly the list got updated
        System.out.println(al2);
        Iterator it2=al2.iterator();
         while(it2.hasNext()){
            System.out.println(it2.next());
        }
    }
}
