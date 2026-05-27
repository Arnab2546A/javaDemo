import java.util.*;

class Student{
    private String name;
    private int age;
    private String city;
    public Student(String name, int age, String city){
        this.name=name;
        this.age=age;
        this.city=city;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getCity(){
        return city;
    }
    public String toString(){
        return name + " " + age + " " +city;
    }
}

public class objMap {
    public static void main(String[] args) {
        Student st1=new Student("Arnab",22,"Khajra");
        // System.out.println(st1);
        Student st2=new Student("Srikanta",23,"Balarampur");
        Student st3=new Student("Srikanta",23,"Balarampur");
        Map map=new HashMap();
        map.put(1,st1);
        map.put(2,st2);
        map.put(3,st3);
        Set set=map.entrySet();
        Iterator it=set.iterator();
        while(it.hasNext()){
            Map.Entry mp= (Map.Entry)it.next();
            System.out.println(mp.getKey()+" "+mp.getValue());
        }
    }
}
