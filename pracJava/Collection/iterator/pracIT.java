
import java.util.*;
public class pracIT {
    public static void main(String[] args) {
        ArrayList ar=new ArrayList();
        ar.add(100);
        ar.add(25);
        ar.add(35);
        ar.add(56);
        ar.add(65);
        ar.add("Arnab");
        ar.add("Dua");

        //iterating through iterator
        Iterator it=ar.iterator();

        while(it.hasNext()){
            Object ob=it.next();
            System.out.println(ob);
        }

        //List Iterator
        ListIterator it1= ar.listIterator(ar.size());
        while(it1.hasPrevious()){
            Object ob1=it1.previous();
            System.out.println(ob1);
        }
    }
}
