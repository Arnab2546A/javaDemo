
import java.util.*;
public class pracArrayDeque {
    public static void main(String[] args){
        ArrayDeque ad1=new ArrayDeque();
        ad1.add(10);
        ad1.add(15);
        ad1.addFirst("Arnab");
        ad1.addLast(100);
        System.out.println(ad1);
        ad1.add("Dua");
        System.out.println(ad1);
        ad1.offer(1);
        ad1.offerFirst(100);
        ad1.offerLast("Thala");
        System.out.println(ad1);
    }
}
