// package arrayList;

public class pracAL {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        al1.add(100);
        al1.add(200);
        al1.add(300);
        System.out.println(al1);
        ArrayList al2 = new ArrayList();
        al2.add("arnab");
        al2.add(21);
        al2.add("dua");
        System.out.println(al2);
        ArrayList al3 = new ArrayList();
        al3.add(100);
        al3.add(200);
        al3.addAll(al2);
        System.out.println("-----------------");
        System.out.println(al3);
        System.out.println("-------------------");
        al1.addAll(2, al3);
        System.out.println(al1);
        System.out.println(al1.contains(200));
        System.out.println(al2.indexOf("dua"));
        System.out.println(al2.size());
    }
}