//Compareble
import java.util.*;
class Student implements Comparable<Student>{
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
public class pracComparable {
    public static void main(String[] args){
        Student s1=new Student(21,"Arnab",29);
        Student s2=new Student(25,"Srikanta",69);
        Student s3=new Student(19,"Thala",777);
        ArrayList<Student> list=new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        Collections.sort(list);
        System.out.println(list);
    }
}
