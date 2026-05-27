
import java.util.*;
import java.util.stream.*;
public class pracStream {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(2);
        al.add(3);
        al.add(5);
        al.add(9);
        al.add(23);
        Stream<Integer> streamData=al.stream();
        //now I can work with the stream.The original list will not be affected
        streamData.forEach(i->System.out.println(i));
    }
}
