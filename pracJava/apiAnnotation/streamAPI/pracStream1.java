
import java.util.*;
import java.util.stream.*;
public class pracStream1 {
    public static void main(String[] args) {
        List<Integer> l1=Arrays.asList(1,2,4,5,6);
        Stream<Integer> stream=l1.stream();
        stream.filter(i->i%2==0)
        .sorted()
        .map(i->i*i)
        .forEach(i->System.out.println(i));
    }
}
