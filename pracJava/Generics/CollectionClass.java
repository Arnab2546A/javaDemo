
import java.util.*;



public class CollectionClass {
    public static void main(String[] args) {
        ArrayList<Integer> al1=new ArrayList<>();
        al1.add(10);
        al1.add(30);
        al1.add(21);
        al1.add(20);
        al1.add(50);
        al1.add(45);
        System.out.println(al1);
        Collections.sort(al1);
        System.out.println(al1);
        System.out.println("--------------------------");
        //binary search
         ArrayList<Integer> al2=new ArrayList<>();
        al2.add(10);
        al2.add(30);
        al2.add(21);
        al2.add(20);
        al2.add(50);
        al2.add(45);
        al2.add(21);
        System.out.println(al2);
        Collections.sort(al2);
        System.out.println(Collections.binarySearch(al2, 50));
        System.out.println(al2);
        //shuffle
        Collections.shuffle(al2);
        System.out.println(al2);
        //frequency
        System.out.println(Collections.frequency(al2, 21));
    }
}
