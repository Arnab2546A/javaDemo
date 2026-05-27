//Compareble
import java.util.*;
class Student {
    int age;
    String name;
    int roll;
    public Student (int age,String name,int roll){
        this.age=age;
        this.name=name;
        this.roll=roll;
    }
    int getAge(){
        return age;
    }
    String getName(){
        return name;
    }
    int getRoll(){
        return roll;
    }
    public int compareTo(Student s){
        return this.age-s.age;
    }
    public String toString(){
        return age + " " + name + " " + roll;
    }
}

class CompareAge implements Comparator<Student>{
     public int compare(Student s1,Student s2){
        return s1.age-s2.age;
    }
}
public class pracComparetor {
    public static void main(String[] args){
        Student s1=new Student(21,"Arnab",29);
        Student s2=new Student(25,"Srikanta",69);
        Student s3=new Student(19,"Thala",777);

        ArrayList<Student> list=new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        CompareAge cg=new CompareAge();
        Collections.sort(list,cg);
        System.out.println(list);
    }
}
