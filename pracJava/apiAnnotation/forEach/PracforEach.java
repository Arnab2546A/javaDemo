
import java.util.*;
public class PracforEach {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(2);
        al.add(3);
        al.add(5);
        al.add(9);
        al.add(23);
        al.forEach((i)->System.out.println(i));
    }
}
