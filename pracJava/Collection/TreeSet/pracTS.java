
import java.util.*;
public class pracTS {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet();
        ts.add(20);
        ts.add(10);
        ts.add(100);
        ts.add(30);
        ts.add(135);
        ts.add(15);
        ts.add(5);
        System.out.println(ts);
        System.out.println(ts.higher(30));
        System.out.println(ts.lower(30));

        System.out.println(ts.ceiling(30));
        System.out.println(ts.ceiling(30));

        System.out.println(ts.ceiling(40));
        System.out.println(ts.floor(40));

        System.out.println(ts.higher(40));
        System.out.println(ts.lower(40));
    }
}
