//making own annotations

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Cricketer{
    String author();
}
@Cricketer(author="Arnab")
class Virat{
    private int age;
    private int score;
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setScore(int score){
        this.score=score;
    }
    public int getScore(){
        return score;
    }
}
public class pracAnnotation {
    public static void main(String[] args) {
        Virat v=new Virat();
        v.setAge(34);
        System.out.println(v.getAge());
        v.setScore(1000);
        System.out.println(v.getScore());
        Class<?> c=v.getClass();
        Cricketer ck=(Cricketer)c.getAnnotation(Cricketer.class);
        System.out.println(ck.author());
    }
}
